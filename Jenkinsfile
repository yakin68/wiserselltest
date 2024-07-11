pipeline {
    agent any
    
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL =  https://hooks.slack.com/services/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
        wisersell-token =  credentials('wisersell-token')
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
        
        stage('Notify Slack') {
            steps {
                script {
                    def status = currentBuild.currentResult
                    def branchName = env.GIT_BRANCH.replaceAll('origin/', '')

                    def payload = [
                        "status": status,
                        "steps": [ /* add step information if necessary */ ],
                        "channel": 'wisersell_test',
                        "config": readFile('.github/config/slack-main.yaml'),
                        "text": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS",
                        "message": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS"
                    ]

                    def jsonPayload = new groovy.json.JsonBuilder(payload).toPrettyString()
                    // Send the notification to Slack
                    sh "curl -X POST -H 'Content-type: application/json' --data '${jsonPayload}' ${env.SLACK_WEBHOOK_URL}"
                    
                    slackSend(
                        channel: 'wisersell_test',
                        color: (status == 'SUCCESS' ? 'good' : 'danger'),
                        message: jsonPayload,
                        tokenCredentialId: 'wisersell-token'
                    )
                }
            }
        }
    }
}
