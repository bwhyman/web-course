package com.example01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/servlet/example01/register")
public class RegisterServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(RegisterServlet.class.getName());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("pwd");
        String gender = req.getParameter("gender");
        String degree = req.getParameter("degree");
        String province = req.getParameter("province");
        String[] courses = req.getParameterValues("courses");
        LOGGER.info("用户名：" + name);
        LOGGER.info("密码：" + password);
        LOGGER.info("性别ID：" + gender);
        LOGGER.info("学历ID：" + degree);
        LOGGER.info("籍贯：" + province);
        for (String c : courses) {
            LOGGER.info("课程ID：" + c);
        }

    }
}
