package com.controller;

import com.service.UserService;
import com.util.JacksonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.json.JsonMapper;

import java.io.IOException;

@WebServlet("/api/listteachers")
public class ListTeachersServlet extends HttpServlet {
    private static final JsonMapper mapper = JacksonUtils.getMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 序列化teachers集合
        var teachersJson = mapper.writeValueAsString(UserService.listTeachers());
        resp.setContentType("application/json");
        resp.getWriter().write(teachersJson);
    }
}
