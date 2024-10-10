# Use the official Tomcat image from Docker Hub
FROM tomcat:latest

# Copy your WAR file into the Tomcat webapps directory
COPY target/my-web-app.war /usr/local/tomcat/webapps/mywebapp.war