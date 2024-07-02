pipeline {
    agent any

    environment {
        PATH+EXTRA = "/usr/bin"
    }

    stages {
        stage('Webhook Test') {
            steps {
                echo 'Webhook triggered successfully!'
            }
        }

        stage('Test Docker') {
            steps {
                script {
                    sh 'docker version'
                    sh 'docker info'
                }
            }
        }
    }
}