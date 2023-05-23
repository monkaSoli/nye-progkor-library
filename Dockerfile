FROM openjdk:17-jdk-alpine3.14
COPY "./target/library.jar" "/app/library.jar"
EXPOSE 8080
CMD [ "java", "-jar", "/app/library.jar" ]
