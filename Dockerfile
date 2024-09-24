FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/springdemo.jar

EXPOSE 8089

CMD ["java","-jar","springdemo.jar"]
