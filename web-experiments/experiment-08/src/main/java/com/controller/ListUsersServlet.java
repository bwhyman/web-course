package com.controller;

import com.service.ServiceFactory;
import com.service.UserService;

import com.util.JacksonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.json.JsonMapper;

import java.io.IOException;

@WebServlet("/api/listusers")
public class ListUsersServlet extends HttpServlet {
    private final UserService userService = ServiceFactory.getUserService();
    private final JsonMapper mapper = JacksonUtils.getMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var users = userService.listUsers();
        resp.getWriter()
                .write(mapper.writeValueAsString(users));
    }
}
