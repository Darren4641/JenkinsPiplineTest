FROM openjdk:11

ARG PROJECT_VERSION=1.0.0

RUN mkdir -p /home/app WORKDIR /home/app

ENV SPRING_PROFILES_ACTIVE dev

ARG JAR_FILE=./build/libs/*-SNAPSHOT.jar

COPY ${JAR_FILE} darrenTest.jar

ENTRYPOINT ["java","-jar","/darrenTest.jar"]
