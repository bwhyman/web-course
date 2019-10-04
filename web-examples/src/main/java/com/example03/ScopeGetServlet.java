package com.example03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
