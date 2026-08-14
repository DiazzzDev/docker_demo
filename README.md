# Docker Demo

Minimal Spring Boot 3 application demonstrating containerized deployment with Java 17, Maven, Docker, and Render.

## Run locally

```bash
./mvnw spring-boot:run
```

Or build and run with Docker:

```bash
docker build -t demo-docker .
docker run --rm -p 8080:8080 demo-docker
```

## Health Check

```text
http://localhost:8080/actuator/health
```

## Stack

* Java 17
* Spring Boot
* Maven
* Docker
* Render
