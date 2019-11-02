package com.controller;

import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adduser")
public class AddUsersServlet extends HttpServlet {
    // 基于ServiceFactory工厂，获取单例的UserService组件
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求参数，调用userService组件完成持久化操作，重定向到ListUserServlet
        String name = req.getParameter("username");
        userService.addUser(name);
        resp.sendRedirect("/listusers");

    }
}
