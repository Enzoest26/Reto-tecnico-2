FROM eclipse-temurin:21-jdk
WORKDIR /app-back
COPY target/app-0.0.1-SNAPSHOT.jar app-front.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app-front.jar"]