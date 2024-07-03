pipeline {
    agent any

    environment {
        // Docker hub 레포지토리 이름
        DOCKER_HUB_REPO = "1004joohyun/wj-sample"
        // Docker hub 자격증명 ID
        DOCKER_HUB_CREDENTIALS_ID = "docker-hub-credentials-id"
    }

    stages {
        stage('Checkout') { // Jenkins가 자동으로 설정된 소스 코드를 체크아웃
            steps {
                checkout scm
            }
        }

        stage('Build') { // Maven 프로젝트를 클린 빌드하고 패키지
            steps {
                script {
                    sh './mvnw clean package'
                }
            }
        }

        stage('Test') {   // 셸 스크립트를 실행하여 Maven 테스트를 실행
            steps {
                script {
                    sh './mvnw test'   
                }
            }
        }

        stage('Build Docker Image') {   // 도커 이미지 빌드 단계 추가
            steps {
                script {
                    sh 'docker build -t $DOCKER_HUB_REPO:$BUILD_NUMBER .'
                }
            }
        }

        stage('Push Docker Image') {   // 도커 이미지 푸시 단계 추가
            steps {
                script {
                    withCredentials([string(credentialsId: "$DOCKER_HUB_CREDENTIALS_ID", variable: 'DOCKER_HUB_PASSWORD')]) { // Jenkins 자격 증명을 사용하여 Docker Hub에 로그인
                        sh 'echo $DOCKER_HUB_PASSWORD | docker login -u $DOCKER_HUB_REPO --password-stdin' // Docker Hub에 로그인
                        sh 'docker push $DOCKER_HUB_REPO:$BUILD_NUMBER' // 빌드된 Docker 이미지를 Docker Hub에 푸시
                    }
                }
            }
        }
    }

    post {
        always { // 빌드 작업이 성공하든, 실패하든 상관 없이 항상 워크스페이스를 정리
            cleanWs()
        }
    }
}