pipeline {
    agent any
    
   
    tools {
        maven 'maven'
    }
    

stages {
        stage('Notify Slack') {
            steps {
                slackSend channel: 'devops', message: '"Testing  branch for VERSION-2 AUTOMATION TESTS'
                script {
                    def status = currentBuild.currentResult
                    def branchName = env.GIT_BRANCH.replaceAll('origin/', '')

                    def payload = [
                        "status": status,
                        "steps": [ /* add step information if necessary */ ],
                        "channel": 'devops',
                        "config": readFile('.github/config/slack-main.yaml'),
                        "text": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS"
                    ]

                    def jsonPayload = new groovy.json.JsonBuilder(payload).toPrettyString()
                    
                    // Send the notification to Slack
                    // sh "curl -X POST -H 'Content-type: application/json' --data '${jsonPayload}' ${env.SLACK_WEBHOOK_URL}"
                    
                    slackSend(
                        channel: 'devops',
                        color: (status == 'SUCCESS' ? 'good' : 'danger'),
                        text: jsonPayload,
                        tokenCredentialId: 'wisersell-token'
                    )
                }

            }
        }
    }
}
