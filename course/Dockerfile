FROM docker.io/maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
COPY course/pom.xml .
COPY course/src ./src
RUN mvn clean package -DskipTests \
FROM cgr.dev/chainguard/jdk:latest
WORKDIR /app \
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]