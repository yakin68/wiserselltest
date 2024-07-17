pipeline {
    
    agent any

    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
        SLACK_WEBHOOK_TOKEN = credentials('SLACK_WEBHOOK_TOKEN')
        SLACK_CREDENTIAL_ID = 'slack-bot-token-son'
    }

    tools {
        maven 'maven'
    }

    stages {
        stage('Initialize') {
            steps {
                script {
                    // Initialize an empty string to hold stage results
                    env.STAGE_RESULTS = ''
                }
            }
        }
        
        stage('Get Git User') {
            steps {
                script {
                    def gitUser = sh(script: "git log -1 --pretty=format:'%an'", returnStdout: true).trim()
                    def commitDate = sh(script: "git log -1 --pretty=format:'%cd'", returnStdout: true).trim()
                    def repoName = sh(script: "basename `git rev-parse --show-toplevel`", returnStdout: true).trim()

                    env.GIT_USER = gitUser ?: 'Unknown User'
                    env.COMMIT_DATE = commitDate ?: 'Unknown Date'
                    env.GIT_REPO_NAME = repoName ?: 'Unknown Repo'
                }
            }
        }

        stage('Test with Maven') {
            steps {
                script {
                    def mvnStatus = sh(script: 'mvn -B package --file pom.xml', returnStatus: true)
                    if (mvnStatus != 0) {
                        echo "Maven build failed with exit code ${mvnStatus}"
                        currentBuild.result = 'FAILURE'                                      
                        env.STAGE_RESULTS += "Stage: :x: Test with Maven - FAILURE \n"  // Success emoji
                    } else {
                        env.STAGE_RESULTS += "Stage: :white_check_mark: Test with Maven - SUCCESS \n"    // Failure emoji
                    }                    
                }
            }
        }

        stage('Archive Test Results') {
            steps {
                script {
                    try {
                        archiveArtifacts artifacts: 'target/**/*', allowEmptyArchive: true
                        env.STAGE_RESULTS += "Stage: :white_check_mark: Archive Test Results - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: Archive Test Results - FAILURE \n"    // Failure emoji
                        currentBuild.result = 'FAILURE'
                        throw e
                    }
                }
            }
        }        
    }

    post {
        always {
            script {
                sendSlackNotification(env.STAGE_RESULTS)
            }
        }
    }
}

def sendSlackNotification(stageResults) {
    def status = currentBuild.currentResult
    def gitUser = env.GIT_USER ?: 'Unknown User'
    def commitDate = env.COMMIT_DATE ?: 'Unknown Date'
    def repoName = env.GIT_REPO_NAME ?: 'Unknown Repo'
    def repoNameUpper = repoName.toUpperCase()
    def branchName = env.GIT_BRANCH.replaceAll('origin/', '') ?: 'Unknown Branch'
    def reportUrl = "https://dev2.wisersell.com.s3.us-east-1.amazonaws.com/${env.STEP_S3_OUTPUT_OBJECT_KEY}/html-reports/Run_Smoke_Test.html"
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": """*Repository:* > *_${repoNameUpper}_*       *Commit Date:* ${commitDate}
*Branch:* ${branchName}    *Job Status:* ${status}    *Actor:* ${gitUser}
*Report URL:* <${reportUrl}|Run Smoke Test>
*Job Steps:*
${stageResults}"""
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
