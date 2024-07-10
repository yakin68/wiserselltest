pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Git deposunu Jenkins çalışma alanına klonlama
                git 'https://github.com/yakin68/wiserselltest.git'
            }
        }
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
