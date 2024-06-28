# 기본적으로 사용할 이미지 설정
FROM openjdk:11-jre-slim

# JAR 파일을 컨테이너에 복사
COPY target/*.jar app.jar

# 애플리케이션을 실행하기 위한 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]

# 기본적으로 노출할 포트 설정
EXPOSE 8080