FROM openjdk:17
MAINTAINER PRAVEENA
COPY target/Spring_Web_MVC_01-0.0.1-SNAPSHOT.jar       /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","Spring_Web_MVC_01-0.0.1-SNAPSHOT.jar"]
EXPOSE 9092
