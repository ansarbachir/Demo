FROM openjdk:17-jdk

WORKDIR /app

COPY target/*.jar /app/springdemo.jar

EXPOSE 8089

CMD ["java","-jar","springdemo.jar"]
