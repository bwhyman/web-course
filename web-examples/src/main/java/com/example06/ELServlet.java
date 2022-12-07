package com.example06;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example06/el")
public class ELServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "BO");
        Address address = new Address("925");
        User user = new User("BO", address);
        req.setAttribute("user", user);
        req.setAttribute("location", 925);
        req.getSession().setAttribute("location", 956);
;        req.getRequestDispatcher("/WEB-INF/el/index.jsp")
                .forward(req, resp);
    }
}
