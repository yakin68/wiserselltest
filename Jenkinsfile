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

        stage('echo test') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test" '''
                        env.STAGE_RESULTS += "Stage: echo test - SUCCESS\n"
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: echo test - FAILURE\n"
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
                        env.STAGE_RESULTS += "Stage: Send the notification to Slack via curl - SUCCESS\n"
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: Send the notification to Slack via curl - FAILURE\n"
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
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": "*Pipeline* finished with status: ${status}\n${stageResults}"
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
