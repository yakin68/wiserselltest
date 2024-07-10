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
}
