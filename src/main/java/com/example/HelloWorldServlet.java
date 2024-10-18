package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.hibernate.cfg.Configuration;

public class HelloWorldServlet extends HttpServlet {
    // Servlet code will go here
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from Jakarta Servlet 5.0!</h1>");

        Configuration configuration = new Configuration();
        configuration.configure(); // Loads hibernate.cfg.xml

        // Retrieve a property value
        String dbUrl = configuration.getProperty("hibernate.connection.url");
        String dbUser = configuration.getProperty("hibernate.connection.username");
        response.getWriter().println(String.format("<span>DBURL: %s</span>", dbUrl));
        response.getWriter().println(String.format("<span>DBUSER: %s</span>", dbUser));

    }
}