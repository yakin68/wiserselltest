pipeline {
    agent any
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Set up JDK 19') {
            steps {
                script {
                    tool 'jdk-19' // Assuming JDK 19 is configured in Jenkins as a tool
                }
            }
        }
        
        stage('Set up Chrome') {
            steps {
                sh 'google-chrome --version' // Adjust this command based on your Jenkins environment
            }
        }
        
        stage('Test with Maven') {
            steps {
                sh 'mvn -B package --file pom.xml'
            }
        }
        
        stage('Upload Test Results to S3') {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_KEY_ID', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
                    sh 'aws s3 cp target s3://${AWS_BUCKET}/target --recursive'
                }
            }
        }
        
        stage('Slack Notification') {
            when {
                expression {
                    currentBuild.result != null
                }
            }
            steps {
                script {
                    def status = currentBuild.result
                    def objectKey = sh(script: 'echo $S3_OBJECT_KEY', returnStdout: true).trim()
                    def slackMessage = "Testing ${env.GITHUB_REF_NAME} branch for VERSION-2 AUTOMATION TESTS\n" +
                                       "https://dev2.wisersell.com.s3.us-east-1.amazonaws.com/${objectKey}/html-reports/Run_Smoke_Test.html"
                    
                    slackSend color: status == 'SUCCESS' ? 'good' : 'danger',
                              message: slackMessage,
                              channel: 'version-2-notification',
                              teamDomain: 'your-slack-workspace-domain',
                              tokenCredentialId: 'slack-token'
                }
            }
        }
    }
}
