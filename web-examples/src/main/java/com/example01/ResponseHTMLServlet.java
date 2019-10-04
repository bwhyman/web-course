package com.example01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example01/responsehtml")
public class ResponseHTMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter()
                .append("<!DOCTYPE html>\n")
                .append("<html\">\n")
                .append("<head>\n")
                .append("<meta charset=UTF-8>\n")
                .append("<title>Web开发技术</title>\n")
                .append("</head>\n")
                .append("<body><h1>Web开发技术</h1></body></html>");
    }
}
