package com.example10.ajax;

import com.datasource.DatabaseUtils;
import com.example09.jdbc.DataSourceUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/title-teachers")
public class TitleTeachersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tid = Integer.parseInt(req.getParameter("tid"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.setAttribute("teachers", DatabaseUtils.listTeacherByTitle(tid));
        req.getRequestDispatcher("/WEB-INF/ajax/title-teachers.jsp").forward(req, resp);
    }
}
