FROM maven:3.8.4-openjdk:11
WORKDIR /sample
COPY src /sample/src
COPY pom.xml /sample