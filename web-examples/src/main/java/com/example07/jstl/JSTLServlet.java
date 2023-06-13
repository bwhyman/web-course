package com.example07.jstl;

import com.datasource.DatabaseUtils;
import com.datasource.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/example07/jstl")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u1 = new User();
        u1.setName("BO");
        User u2 = new User();
        u2.setName("ZHANG");
        User u3 = new User();
        u3.setName("SUN");
        req.setAttribute("users", List.of(u1, u2, u3));
        req.getRequestDispatcher("/WEB-INF/jstl/index.jsp").forward(req, resp);
    }
}
