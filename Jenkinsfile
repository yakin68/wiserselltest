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
        stage('Notify Slack') {
            steps {
                script {
                    def attachments = [
                      [
                        text: 'I find your lack of faith disturbing!',
                        fallback: 'Hey, Vader seems to be mad at you.',
                        color: '#ff0000'
                      ]
                    ]
                    
                    slackSend(channel: "#devops", attachments: attachments)
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
}
