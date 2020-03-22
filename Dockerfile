FROM centos:centos7

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

RUN yum remove firewalld -y

RUN yum install java-1.8.0-openjdk -y

ENTRYPOINT ["java","-jar","app.jar"]