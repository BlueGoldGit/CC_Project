#Official maven/java 8 image to create build artifact
FROM maven:3.8-jdk-11 as builder
#Copy the local code to container image
WORKDIR /app
COPY pom.xml .
COPY src ./src

#Build a release artifact
RUN mvn package -DskipTests

#Use AdoptOpenJDK for the base image
FROM adoptopenjdk/openjdk11:alpine-jre

#Copy jar to the production image from the builder stage
COPY --from=builder /app/target/ccproject-*.jar /ccproject.jar

#Run the webservice whenever container starts
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/ccproject.jar"]
