package com.example10.ajax;

import com.datasource.DatabaseUtils;
import com.datasource.Title;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ajax-main")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Title> titles = DatabaseUtils.listTitles();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        req.setAttribute("titles", titles);
        req.getRequestDispatcher("/WEB-INF/ajax/main.jsp").forward(req, resp);
    }
}
