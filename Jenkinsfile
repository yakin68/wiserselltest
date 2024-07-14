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
                    // Initialize an empty list to hold stage results
                    def stageResults = []
                    // Store the list in the environment variable for later use
                    env.STAGE_RESULTS = stageResults
                }
            }
        }
        
        stage('Get Git User') {
            steps {
                script {
                    def gitUser = sh(script: "git log -1 --pretty=format:'%an'", returnStdout: true).trim()
                    def commitDate = sh(script: "git log -1 --pretty=format:'%cd'", returnStdout: true).trim()
                    env.GIT_USER = gitUser ?: 'Unknown User'
                    env.COMMIT_DATE = commitDate ?: 'Unknown Date'
                }
            }
        }
        
        stage('echo test') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test" '''
                        env.STAGE_RESULTS += "Stage: :white_check_mark: echo test - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: echo test - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }
        
        stage('Send the notification to Slack via curl') {
            steps {
                script {
                    try {
                        def status = currentBuild.currentResult
                        def branchName = env.GIT_BRANCH.replaceAll('origin/', '')
                        sh "chmod +x ./curl.sh"
                        sh """
                        status=${status} branchName=${branchName} ./curl.sh
                        """
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
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": "*Repository:* ${repoName}\n*Commit Date:* ${commitDate}\n*Job Status:* ${status}\n*Triggered by:* ${gitUser}\n*Job Steps:*\n${env.STAGE_RESULTS}"
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
