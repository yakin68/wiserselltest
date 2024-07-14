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
                    // Global list to hold stage results
                    currentBuild.stageResults = []
                }
            }
        }

        stage('echo test') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test" '''
                        currentBuild.stageResults.add("Stage: echo test - SUCCESS")
                    } catch (Exception e) {
                        currentBuild.stageResults.add("Stage: echo test - FAILURE")
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
                        currentBuild.stageResults.add("Stage: Send the notification to Slack via curl - SUCCESS")
                    } catch (Exception e) {
                        currentBuild.stageResults.add("Stage: Send the notification to Slack via curl - FAILURE")
                        throw e
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                sendSlackNotification(currentBuild.stageResults)
            }
        }
    }
}

def sendSlackNotification(stageResults) {
    def status = currentBuild.currentResult
    def stagesInfo = stageResults.join("\n")
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": "*Pipeline* finished with status: ${status}\n${stagesInfo}"
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
