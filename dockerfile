# Use an official OpenJDK image
FROM openjdk:26-ea-24-slim

# Set working directory
WORKDIR /app

# Copy your JAR file into the container
COPY target/java-task-1.0-SNAPSHOT.jar /app/myapp.jar

# Expose the application port (change if needed)
EXPOSE 8080

# Automatically run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "myapp.jar"]
