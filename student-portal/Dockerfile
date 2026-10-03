FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
# Sara project copy karein
COPY . .
# Agar pom.xml student-portal folder ke andar hai, toh hum wahan switch karenge ya direct build chalayenge
# Yahan hum check karenge ki pom.xml kahan hai. Agar student-portal root hai toh:
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/student-portal/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
