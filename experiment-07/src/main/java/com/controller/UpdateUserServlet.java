package com.controller;

import com.entity.User;
import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/updateuser")
public class UpdateUserServlet extends HttpServlet {
    // 基于ServiceFactory工厂，获取单例的UserService组件
    private UserService userService = ServiceFactory.getUserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 实现加载全部用户，并转发至/WEB-INF/jsp/listusers.jsp
        int id = Integer.parseInt(req.getParameter("uid"));
        String newName = req.getParameter("username");
        User user = new User(id, newName);
        userService.updateUser(user);
        resp.sendRedirect(req.getContextPath() + "/listusers");

    }
}