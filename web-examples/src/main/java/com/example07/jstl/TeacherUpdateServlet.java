package com.example07.jstl;

import com.datasource.entity.Course;
import com.datasource.DatabaseUtils;
import com.datasource.entity.Teacher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/jstl/updateteacher")
public class TeacherUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Course> courses = List.of(DatabaseUtils.getCourse(1), DatabaseUtils.getCourse(7));
        Teacher t = new Teacher(12, "王小明", DatabaseUtils.getTitle(2), courses);
        req.setAttribute("teacher", t);
        req.setAttribute("titles", DatabaseUtils.listTitles());
        req.setAttribute("courses", DatabaseUtils.listCourses());
        req.getRequestDispatcher("/WEB-INF/jstl/updateteacher.jsp")
                .forward(req, resp);
    }
}
