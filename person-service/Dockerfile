FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/person-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} person-service.jar
ENV OAUTH_SERVER_ADDRESS=192.168.1.70
ENTRYPOINT ["java","-jar","/person-service.jar"]