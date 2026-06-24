FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/demo-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", \
  "-Xms256m", "-Xmx512m", \
  "-XX:+UseG1GC", \
  "-Djava.security.egd=file:/dev/./urandom", \
  "app.jar"]
