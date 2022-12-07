package com.example07.jstl;

import com.datasource.DatabaseUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jstl/getcourse")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int courseId = Integer.parseInt(req.getParameter("cid"));
        req.setAttribute("course", DatabaseUtils.getCourse(courseId));
        req.getRequestDispatcher("/WEB-INF/jstl/getcourse.jsp")
                .forward(req, resp);
    }
}
