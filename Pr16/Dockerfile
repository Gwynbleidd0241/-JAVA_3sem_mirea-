FROM openjdk:21-jdk-slim

WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

EXPOSE 8080
