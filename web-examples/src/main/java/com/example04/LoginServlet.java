package com.example04;

import com.example04.DatabaseUtils;
import com.example04.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/example04/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/example04/login.html")
                .forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uerName = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        User user = DatabaseUtils.getUser(uerName, pwd);
        String url;
        if (user != null) {
            // 用户存在，将用户对象加入session，下次请求可直接从session中获取
            req.getSession().setAttribute("user", user);
            // 重定向到welcome页面
            url = req.getContextPath()+ "/example04/welcome";
        } else {
            // 用户不存在，重定向到登录页面
            url = req.getContextPath()+ "/example04/login";
        }
        // 无论怎么，post请求后，均重定向
        resp.sendRedirect(url);
    }
}
