FROM openjdk:8
ADD target/customer-1.0.jar customer.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","customer.jar"]