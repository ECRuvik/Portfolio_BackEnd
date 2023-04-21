FROM amazoncorretto:17
MAINTAINER ecruvik
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/portfolio-deploy-0.0.1-SNAPSHOT"]