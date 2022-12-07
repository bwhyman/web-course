package com.example07.jstl;

import com.datasource.DatabaseUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jstl/listcourses")
public class CourseListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("courses", DatabaseUtils.listCourses());
        req.getRequestDispatcher("/WEB-INF/jstl/listcourses.jsp").forward(req, resp);
    }
}
