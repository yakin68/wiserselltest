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
                slackSend channel: 'devops', message: '"Testing  branch for VERSION-2 AUTOMATION TESTS 1111'
                script {
                    
                    slackSend(
                        channel: 'devops',
                        color: (status == 'SUCCESS' ? 'good' : 'danger'),
                        text: jsonPayload,
                        tokenCredentialId: env.SLACK_CREDENTIAL_ID
                    )
                }

            }
        }
        stage('Send the notification to Slack') {
            steps {
                sh 'chmod +x ./curl.sh'
                sh ''' ./curl.sh   '''
            }  
        }      
    }
}
