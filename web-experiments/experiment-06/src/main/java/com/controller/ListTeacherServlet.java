package com.controller;

import com.util.DatabaseUtils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listteachers")
public class ListTeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("teachers", DatabaseUtils.listTeachers());
        req.getRequestDispatcher("/WEB-INF/jsp/listteachers.jsp")
                .forward(req, resp);
    }
}
