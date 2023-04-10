FROM openjdk:17

COPY \target\PhysicianAvailability-0.0.1-SNAPSHOT.jar /PhysicianAvailability.jar

CMD ["java","-jar","PhysicianAvailability.jar"]