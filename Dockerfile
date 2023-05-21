## Fetching latest version of Java
#FROM openjdk:19
#FROM maven:3.6.3 AS maven
## Setting up work directory
#WORKDIR /app
#
## Copy the jar file into our app
#COPY . /app
#RUN mvn install
## Exposing port 3000
#EXPOSE 3000
#ARG JAR_FILE=airquality.jar
#
## Starting the application
#CMD ["java", "-jar", "airquality.jar"]
FROM openjdk:19
EXPOSE 3000
ADD target/weather_jar.jar weather_jar.jar
ENTRYPOINT ["java", "-jar", "/weather_jar.jar"]