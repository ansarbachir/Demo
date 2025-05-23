FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo.jar /app/springdemo.jar

EXPOSE 8089

CMD ["java","-jar","springdemo.jar"]
