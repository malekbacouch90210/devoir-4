#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="malek.com"
# ✅ Installer curl
RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*
# Add the application's jar to the image
COPY target/demographie-microservice-0.0.1-SNAPSHOT.jar demographie-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "demographie-microservice-0.0.1-SNAPSHOT.jar"]