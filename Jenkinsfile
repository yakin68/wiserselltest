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
        
        stage('echo test 1') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test 1" '''
                        env.STAGE_RESULTS += "Stage: :white_check_mark: echo test 1 - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: echo test 1 - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }

        stage('echo test 2') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test 2" '''
                        env.STAGE_RESULTS += "Stage: :white_check_mark: echo test 2 - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: echo test 2 - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }
        
        stage('Send the notification to Slack via curl') {
            steps {
                script {
                    try {

                        env.STAGE_RESULTS += "Stage: :white_check_mark: Send the notification to Slack via curl - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: Send the notification to Slack via curl - FAILURE \n"    // Failure emoji
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
                *Branch:* ${branchName}
                *Report URL:* <${reportUrl}|Run Smoke Test>
                *Job Status:* ${status}  *Actor:* ${gitUser}
                *Job Steps:*
                ${stageResults}"""
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
