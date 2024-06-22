package com.controller;

import com.util.DatabaseUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

@WebServlet("/updateteacher")
public class UpdateTeacherServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(UpdateTeacherServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tid = Integer.parseInt(req.getParameter("tid"));
        req.setAttribute("teacher", DatabaseUtils.getTeacher(tid));
        req.setAttribute("titles", DatabaseUtils.listTitles());
        req.setAttribute("courses", DatabaseUtils.listCourses());
        req.getRequestDispatcher("/WEB-INF/jsp/updateteacher.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        logger.info("姓名：" + req.getParameter("name"));
        logger.info("职称ID：" + req.getParameter("titleid"));
        logger.info("课程ID：" + Arrays.toString(req.getParameterValues("courseids")));
    }
}
