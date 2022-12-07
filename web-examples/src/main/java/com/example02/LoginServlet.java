package com.example02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example02/login")
public class LoginServlet extends HttpServlet {
    private static final String BASE_RES = "/WEB-INF/example02/";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(BASE_RES + "login.html")
                .forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("pwd");
        String relUrl
                = "BO".equals(userName) && "123456".equals(password)
                ? "/example02/welcome"
                : "/example02/login";
        resp.sendRedirect(req.getContextPath() + relUrl);
    }
}
