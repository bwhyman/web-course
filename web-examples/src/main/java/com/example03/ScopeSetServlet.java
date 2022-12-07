package com.example03;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/example03/setscope")
public class ScopeSetServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ScopeSetServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("requestScope", "request级作用域");
        HttpSession session = req.getSession();
        session.setAttribute("sessionScope", "session会话级作用域");
        ServletContext context = req.getServletContext();
        context.setAttribute("contextScope", "application应用级作用域");

        LOGGER.info("在第一次请求：" + (String) req.getAttribute( "requestScope"));
        LOGGER.info("在第一次请求：" + (String) req.getSession().getAttribute("sessionScope"));
        LOGGER.info("在第一次请求：" + (String) req.getServletContext().getAttribute("contextScope"));
    }
}
