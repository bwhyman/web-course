package com.example01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/helloservlet")
public class HelloServlet extends HttpServlet {
    private static final Logger LOGGER =
            Logger.getLogger(HelloServlet.class.getName());
    public HelloServlet() {
        LOGGER.info("HelloServlet()");
    }
    @Override
    public void init() throws ServletException {
        super.init();
        LOGGER.info("init()");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("service()");
        super.service(req, resp);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    // 处理http get请求
        LOGGER.info("doGet()");
    }
}
