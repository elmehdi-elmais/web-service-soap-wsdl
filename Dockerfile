FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*
RUN apt-get install -y tree



CMD ["bash"]
