pipeline {
    agent any

    tools {
        maven 'maven'
    }
    

    stages {
        stage('Build') {
            steps {
                // Maven ile clean ve package komutlarını çalıştırma
                sh 'mvn clean package'

            }
        }
        stage('Test') {
            steps {
                // Maven ile test komutunu çalıştırma (isteğe bağlı)
                sh 'mvn test'
            }
        }
    }
}
