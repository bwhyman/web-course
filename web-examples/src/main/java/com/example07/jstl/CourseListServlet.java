package com.example07.jstl;

import com.datasource.DatabaseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jstl/listcourses")
public class CourseListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("courses", DatabaseUtils.listCourses());
        req.getRequestDispatcher("/WEB-INF/jstl/listcourses.jsp").forward(req, resp);
    }
}
