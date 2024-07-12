pipeline {
    agent any
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
        SLACK_WEBHOOK_TOKEN = credentials('SLACK_WEBHOOK_TOKEN')
    }    
   
    tools {
        maven 'maven'
    }
    

stages {

        stage('Install curl') {
            steps {
                sh 'chmod +x ./curl.sh'
                sh ''' ./curl.sh   '''
            }  
        }    
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
                        "text": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS-NEWW"
                    ]

                    def jsonPayload = new groovy.json.JsonBuilder(payload).toPrettyString()
                    
                    // Send the notification to Slack
                    //sh "curl -X POST -H 'Content-type: application/json' --data '{"text":"Hello, World!"}' https://hooks.slack.com/services/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"
                    //sh "curl -X POST -H 'Content-type: application/json' --data '${jsonPayload}' ${env.SLACK_WEBHOOK_URL}"
                    
                    slackSend(
                        channel: 'devops',
                        color: (status == 'SUCCESS' ? 'good' : 'danger'),
                        text: jsonPayload,
                        //tokenCredentialId: 'wisersell-token'
                    )
                }

            }
        }
    }
}
