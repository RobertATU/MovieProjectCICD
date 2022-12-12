FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/MovieProjectCICD-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} MovieProjectCICD-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MovieProjectCICD-0.0.1-SNAPSHOT.jar"]