FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/gs-spring-boot-docker-0.1.0.jar app.jar

# Application needs to read a properties file
# COPY my-java-configuration.properties /props/my-java-configuration.properties

RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar", "--spring.config.location=file:/props/my-java-configuration.properties"]
