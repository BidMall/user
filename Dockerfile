FROM openjdk:21-jdk-slim
COPY build/libs/user-0.0.1-SNAPSHOT.jar user.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "user.jar"]