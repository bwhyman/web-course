package com.example01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/parameter")
public class ParameterServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ParameterServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("boardid: " + req.getParameter("boardid"));
        LOGGER.info("topicid: " + req.getParameter("topicid"));
        resp.getWriter().println("boardid: " + req.getParameter("boardid"));
        resp.getWriter().println("topicid: " + req.getParameter("topicid"));
    }
}
