pipeline {
    agent any

    stages {
        stage('Webhook Test') {
            steps {
                echo 'Webhook triggered successfully!'
            }
        }
    }

    stages {
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