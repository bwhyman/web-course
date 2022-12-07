package com.controller;

import com.service.ServiceFactory;
import com.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/getuser")
public class GetUsersServlet extends HttpServlet {
    // 基于ServiceFactory工厂，获取单例的UserService组件
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取指定ID用户的详细信息
        int id = Integer.parseInt(req.getParameter("uid"));
        req.setAttribute("user", userService.getUser(id));
        req.getRequestDispatcher("/WEB-INF/jsp/query.jsp")
                .forward(req, resp);

    }
}
