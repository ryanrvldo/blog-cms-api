FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine

COPY application/target/application-0.0.1-SNAPSHOT.war /app/blog-cms-api-0.0.1.war

CMD ["java", "-jar", "/app/blog-cms-api-0.0.1.war"]