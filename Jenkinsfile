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
    }

    post {
        always { // 빌드 작업이 성공하든, 실패하든 상관 없이 항상 워크스페이스를 정리
            cleanWs()
        }
    }
}