FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/bankrates-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} bankrates.jar
ENTRYPOINT ["java","-jar","/bankrates.jar"]