package com.example07.jstl;

import com.datasource.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/jstl/httpsession")
public class HttpSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roleP = req.getParameter("role");
        if (roleP != null) {
            int role = Integer.parseInt(roleP);
            // 模拟用户
            User user = new User();
            user.setName("BO");
            if (role == User.ADMIN) {
                user.setName("admin");
            }
            // 模拟权限
            user.setRole(role);
            req.getSession().setAttribute("user", user);
        } else {
            // 未登录测试，移除user对象
            req.getSession().removeAttribute("user");
        }

        req.getRequestDispatcher("/WEB-INF/jstl/httpsession.jsp").forward(req, resp);

    }
}
