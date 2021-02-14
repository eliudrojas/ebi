FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/oauth-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} oauth.jar
ENTRYPOINT ["java","-jar","/oauth.jar"]