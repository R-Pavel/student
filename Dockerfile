FROM openjdk:17-jdk-alpine
LABEL maintainer="https://github.com/R-Pavel"
VOLUME /main-app
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]