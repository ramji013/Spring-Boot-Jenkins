FROM openjdk:8
EXPOSE 5010
ADD target/spring-boot-jenkins-docker.jar spring-boot-jenkins-docker.jar
ENTRYPOINT ["java", "-jar", "spring-boot-jenkins-docker.jar"]