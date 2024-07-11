pipeline {
    agent any
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
    }
    
    tools {
        maven 'maven'
    }
    

stages {
        stage('Test with Maven') {
            steps {
                script {
                    def mvnStatus = sh(script: 'mvn -B package --file pom.xml', returnStatus: true)
                    if (mvnStatus != 0) {
                        echo "Maven build failed with exit code ${mvnStatus}"
                        currentBuild.result = 'FAILURE'
                    }
                }
            }
        }

        stage('Archive Test Results') {
            steps {
                // Archive the test results
                archiveArtifacts artifacts: 'target/**/*', allowEmptyArchive: true
            }
        }
        stage('Upload Test Results to S3') {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_KEY_ID', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
                    sh 'aws s3 cp target s3://${AWS_BUCKET}/target --recursive'
                }
            }
        }
        
        stage('Notify Slack') {
            steps {
                script {
                    def status = currentBuild.currentResult
                    def branchName = env.GIT_BRANCH.replaceAll('origin/', '')

                    def payload = [
                        "status": status,
                        "steps": [ /* add step information if necessary */ ],
                        "channel": 'version-2-notification',
                        "config": readFile('.github/config/slack-main.yaml'),
                        "message": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS"
                    ]

                    def jsonPayload = new groovy.json.JsonBuilder(payload).toPrettyString()

                    slackSend(
                        channel: 'version-2-notification',
                        color: (status == 'SUCCESS' ? 'good' : 'danger'),
                        message: jsonPayload,
                        webhookToken: SLACK_WEBHOOK_URL
                    )
                }
            }
        }
    }
}
