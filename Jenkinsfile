pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = "1004joohyun/wj-sample"
        DOCKER_HUB_CREDENTIALS_ID = "docker-hub-credentials-id"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    sh './mvnw clean package'
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}