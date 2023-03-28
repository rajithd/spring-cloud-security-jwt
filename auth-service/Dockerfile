FROM openjdk:17
MAINTAINER Rajith Delantha <rajithgama@gmail.com>

WORKDIR auth-service
ADD auth-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/auth-service-0.0.1.jar"]

EXPOSE 9004
