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

    // Global list to hold stage results
    def stageResults = []

    stages {
        stage('echo test') {
            steps {
                script {
                    sh '''echo "yakin stage test" '''
                }
            }
        }
        
        stage('Send the notification to Slack via curl') {
            steps {
                script {
                    def status = currentBuild.currentResult
                    def branchName = env.GIT_BRANCH.replaceAll('origin/', '')
                    sh "chmod +x ./curl.sh"
                    sh """
                    status=${status} branchName=${branchName} ./curl.sh
                    """
                }
            }
        }
    }

    post {
        always {
            script {
                // Add results to the global list
                stageResults.add("Stage: echo test - SUCCESS")
                stageResults.add("Stage: Send the notification to Slack via curl - SUCCESS")

                sendSlackNotification(stageResults)
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
