FROM meven:3.6.3-openjdk11-slim as BULDER
ARG VERSION=8.0.1-SNAPSHOT
WORKDIR /build/
COPY src /build/src/

RUN mvn clean package
COPY target/booting-web-${VERSION}.jar target/application.jar


FROM openjdk:11.0.8-jre-slin
WORKDIR /app/

COPY --from=BULDER /build/target/application.jar /app/
CMD java -jar /app/application.jar