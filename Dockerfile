# �⺻������ ����� �̹��� ����
FROM openjdk:11-jre-slim

# JAR ������ �����̳ʿ� ����
COPY target/*.jar app.jar

# ���ø����̼��� �����ϱ� ���� ���ɾ�
ENTRYPOINT ["java", "-jar", "/app.jar"]

# �⺻������ ������ ��Ʈ ����
EXPOSE 8080