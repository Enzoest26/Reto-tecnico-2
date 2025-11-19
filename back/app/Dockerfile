FROM eclipse-temurin:21-jdk
WORKDIR /app-back
COPY target/app-0.0.1-SNAPSHOT.jar app-back.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app-back.jar"]