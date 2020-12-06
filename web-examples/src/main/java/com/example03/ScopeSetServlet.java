package com.example03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
