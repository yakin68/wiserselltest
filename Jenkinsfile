pipeline {
    agent any

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
    }

    post {
        always {
            // Save the build results and artifacts regardless of the build result
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/**/*', allowEmptyArchive: true
            // Optionally, you can clean up the workspace
            cleanWs()
        }
    }
}
