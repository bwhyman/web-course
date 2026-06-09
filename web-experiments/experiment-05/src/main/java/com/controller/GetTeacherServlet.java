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
import java.util.Map;

@WebServlet("/api/getteacher")
public class GetTeacherServlet extends HttpServlet {
    private static final JsonMapper mapper = JacksonUtils.getMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int teacherId = Integer.parseInt(req.getParameter("tid"));
        // 查询具体教师
        var teacher = UserService.getTeacher(teacherId);
        // 全部职称
        var titles = UserService.listTitles();
        // 全部课程
        var courses = UserService.listCourses();
        // 封装结果
        var result = Map.of("titles", titles, "courses", courses,  "teacher", teacher);
        resp.setContentType("application/json");
        resp.getWriter().write(mapper.writeValueAsString(result));
    }
}
