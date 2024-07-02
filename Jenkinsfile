pipeline {
    agent any

    stages {
        stage('Webhook Test') {
            steps {
                echo 'Webhook triggered successfully!'
            }
        }

        stage('Test Docker') {
            steps {
                script {
                    sh '/usr/bin/docker version'
                    sh '/usr/bin/docker info'
                }
            }
        }
    }
}