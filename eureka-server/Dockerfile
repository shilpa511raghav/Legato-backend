FROM maven:3.6.3-jdk-8
COPY target/eureka-server.jar /data/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/data/eureka-server.jar"]