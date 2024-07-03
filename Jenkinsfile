pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = "1004joohyun/wj-sample"
        DOCKER_HUB_CREDENTIALS_ID = "docker-hub-credentials-id"
    }

    stages {
        stage('Webhook Test') {
            steps {
                echo 'Webhook triggered successfully!'
            }
        }
    }
}