pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = "1004joohyun/wj-sample"
        //DOCKER_HUB_CREDENTIALS_ID = "dockerhub"
        DOCKERHUB_CREDENTIALS_ID = credentials('dockerhub') // jenkins에 등록해 놓은 docker hub credentials 이름!
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

        stage('Test') {
            steps {
                script {
                    sh './mvnw test'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t $DOCKER_HUB_REPO:$BUILD_NUMBER .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    withCredentials([string(credentialsId: "$DOCKER_HUB_CREDENTIALS_ID", variable: 'DOCKER_HUB_PASSWORD')]) {
                        sh 'echo $DOCKER_HUB_PASSWORD | docker login -u $DOCKER_HUB_REPO --password-stdin'
                        sh 'docker push $DOCKER_HUB_REPO:$BUILD_NUMBER'
                    }
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