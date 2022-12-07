package com.example03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/example03/getscope")
public class ScopeGetServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ScopeGetServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("在第二次请求：" + (String) req.getAttribute( "requestScope"));
        LOGGER.info("在第二次请求：" + (String) req.getSession().getAttribute("sessionScope"));
        LOGGER.info("在第二次请求：" + (String) req.getServletContext().getAttribute("contextScope"));
    }
}
