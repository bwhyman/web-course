package com.example02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
                ? req.getContextPath()+ "/example02/welcome"
                : req.getContextPath()+ "/example02/login";
        resp.sendRedirect(relUrl);
    }
}
