pipeline {
    agent any
    
   
    tools {
        maven 'maven'
    }
    

stages {
        stage('Notify Slack') {
            steps {
                slackSend channel: 'devops', message: '"Testing  branch for VERSION-2 AUTOMATION TESTS'

            }
        }
    }
}
