FROM openjdk:11
COPY target/operator*.jar /opt/
CMD ["java", "-jar", "/opt/chat-graph.jar"]
