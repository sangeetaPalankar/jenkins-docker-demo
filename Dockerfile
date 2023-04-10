FROM openjdk:17
EXPOSE 9011

ADD \target\demo1.jar /demo1.jar

ENTRYPOINT ["java","-jar","demo1.jar"]