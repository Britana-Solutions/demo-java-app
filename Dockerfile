# Use the official Tomcat image from Docker Hub
FROM tomcat:latest

#WORKDIR /app
#COPY src .
#COPY pom.xml .
#RUN mvn clean install && mvn clean packages && ls /app

# Copy your WAR file into the Tomcat webapps directory
COPY target/my-web-app.war /usr/local/tomcat/webapps/mywebapp.war