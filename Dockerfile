FROM openjdk:11
ADD target/spr1.jar spr1.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","spr1.jar"]