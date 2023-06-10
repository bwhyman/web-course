package com.example07.httpsession;

import com.datasource.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/httpsession/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        User user = UserService.login(userName);
        if (user != null) {
            // 登录成功，将用户对象置于session
            req.getSession().setAttribute("user", user);
        }
        // 登录后，重新，重定向到首页
        resp.sendRedirect(req.getContextPath() + "/httpsession/index");
    }
}
