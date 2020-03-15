FROM openjdk:11
COPY target/operator*.jar /opt/operator.jar
CMD ["java", "-jar", "/opt/operator.jar"]
