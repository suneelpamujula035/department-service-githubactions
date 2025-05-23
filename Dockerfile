FROM openjdk:17
VOLUME /tmp
COPY target/department-service.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]