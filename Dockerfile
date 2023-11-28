FROM openjdk:17-oracle
COPY target/msal-demo-0.0.1-SNAPSHOT.jar /home/msal-demo.jar
EXPOSE 8080
WORKDIR /home
ENTRYPOINT ["java", "--enable-preview", "-jar", "msal-demo.jar"]