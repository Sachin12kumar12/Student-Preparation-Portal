FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
# Sara project copy karein
COPY . .
# student-portal ke andar jaakar maven build chalayein
WORKDIR /app/student-portal
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Build hue jar file ko copy karein
COPY --from=build /app/student-portal/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
