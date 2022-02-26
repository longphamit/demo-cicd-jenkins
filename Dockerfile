FROM openjdk:8-jdk-alpine
MAINTAINER longpc.com
EXPOSE 8081
COPY target/demo-cicd-jenkins-0.0.1-SNAPSHOT.jar demo-cicd-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-cicd-jenkins-0.0.1-SNAPSHOT.jar"]