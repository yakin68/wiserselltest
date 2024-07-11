pipeline {
    agent any
    
    environment {
        SLACK_TOKEN = credentials('SLACK_TOKEN')
    }
    
    tools {
        maven 'maven'
    }
    

stages {
        stage('Notify Slack') {
            steps {
                slackSend channel: 'wisersell_test', message: '"Testing  branch for VERSION-2 AUTOMATION TESTS'

            }
        }
    }
}
