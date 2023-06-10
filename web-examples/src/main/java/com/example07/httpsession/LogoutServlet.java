package com.example07.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/httpsession/logout")
public class LogoutServlet extends IndexServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从session中移除登录对象
        req.getSession().removeAttribute("user");
        resp.sendRedirect(req.getContextPath() + "/httpsession/index");
    }
}
