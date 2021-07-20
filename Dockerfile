FROM openjdk:8-jdk-alpine
ADD target/mongodb-service-0.0.1-SNAPSHOT.jar mongodb-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c", "java -jar /mongodb-service-0.0.1-SNAPSHOT.jar"]