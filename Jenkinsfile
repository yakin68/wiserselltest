pipeline {
    agent any

    tools {
        maven 'maven'
    }
    

stages {
        stage('Test with Maven') {
            steps {
                script {
                    try {
                        // Run Maven build in batch mode
                        sh 'mvn -B package --file pom.xml'
                    } catch (Exception e) {
                        echo "Build failed: ${e.message}"
                        currentBuild.result = 'FAILURE'
                        throw e
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
