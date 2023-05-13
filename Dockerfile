FROM openjdk:17-jdk-alpine3.14
COPY "./target/library-catalog.jar" "/app/library-catalog.jar"
EXPOSE 8080
CMD [ "java", "-jar", "/app/library-catalog.jar" ]
