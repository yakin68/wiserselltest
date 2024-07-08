pipeline {
    agent {
        kubernetes {
        //cloud 'kubernetes'
        containerTemplate {
            name 'maven'
            image 'maven:3-amazoncorretto-21'
            command 'sleep'
            args '99d'
        }
        }
    }
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Run maven') {
            steps {
                sh 'mvn -version'
            }
        }
    }
}
