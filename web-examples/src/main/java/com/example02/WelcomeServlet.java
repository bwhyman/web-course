package com.example02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example02/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final String BASE = "/WEB-INF/example02/";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(BASE + "welcome.html")
                .forward(req, resp);
    }
}
