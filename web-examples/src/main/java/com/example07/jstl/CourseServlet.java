package com.example07.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
