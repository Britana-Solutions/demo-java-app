package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import org.hibernate.cfg.Configuration;

public class HelloWorldServlet extends HttpServlet {
    // Servlet code will go here
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from Jakarta Servlet 5.0!</h1>");

        // Retrieve a property value
        String dbUrl = System.getProperty("DBURL");
        String dbUser = System.getProperty("DBUSER");
        response.getWriter().println(String.format("<span>DBURL: %s</span>", dbUrl));
        response.getWriter().println(String.format("<span>DBUSER: %s</span><br>", dbUser));
    }
}