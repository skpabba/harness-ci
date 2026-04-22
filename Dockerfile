FROM maven:3.8.6-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -q
COPY src ./src
RUN mvn package -DskipTests -q

FROM eclipse-temurin:11-jre-jammy
WORKDIR /app
COPY --from=build /app/target/hello-world.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
