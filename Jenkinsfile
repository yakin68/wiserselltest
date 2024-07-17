pipeline {
    agent any
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::yuceltest'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
        SLACK_WEBHOOK_TOKEN = credentials('SLACK_WEBHOOK_TOKEN')
        SLACK_CREDENTIAL_ID = 'slack-bot-token-son'
        STAGE_RESULTS = ''
    }

    tools {
        maven 'maven'
    }

    stages {

        stage('Initialize') {
            steps {
                script {
                    // Initialize an empty list to hold stage results

                    // Store the list in the environment variable for later use
                    env.STAGE_RESULTS = ''
                }
            }
        }
        
        stage('Get Git User') {
            steps {
                script {

                    // Fetch branch name from Git SCM
                    def scmVars = checkout scm
                    def branchName = scmVars.GIT_BRANCH ?: sh(script: 'git rev-parse --abbrev-ref HEAD', returnStdout: true).trim()
                    echo "Current branch: ${branchName}"
                    
                    def gitUser = sh(script: "git log -1 --pretty=format:'%an'", returnStdout: true).trim()
                    def commitDate = sh(script: "git log -1 --pretty=format:'%cd'", returnStdout: true).trim()
                    def repoName = sh(script: "basename `git rev-parse --show-toplevel`", returnStdout: true).trim()

                    env.GIT_USER = gitUser ?: 'Unknown User'
                    env.COMMIT_DATE = commitDate ?: 'Unknown Date'
                    env.GIT_REPO_NAME = repoName ?: 'Unknown Repo' 
                }
            }
        }

  
        stage('test adım1') {
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
        
        stage('test adım2') {
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
    def branchName = env.GIT_BRANCH // GitHub branch adını al
    def reportUrl = "https://dev2.wisersell.com.s3.us-east-1.amazonaws.com/${env.STEP_S3_OUTPUT_OBJECT_KEY}/html-reports/Run_Smoke_Test.html"
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": "*Branc Name:* ${branchName}  \n*Repository:* > *_${repoNameUpper}_*       *Commit Date:* ${commitDate}\n *Job Status:* ${status}    *Actor:* ${gitUser}    *Branch:* ${branchName}\n *Report URL:* <${reportUrl}|Run Smoke Test>\n *Job Steps:*\n${stageResults}"
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
