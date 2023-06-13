package com.example04;

import com.datasource.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@WebServlet("/example04/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(WelcomeServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从session中获取user对象
        User user = (User) req.getSession().getAttribute("user");
        if (user == null) {
            // 如果session中用户不存在，则重定向到登录页面
            resp.sendRedirect(req.getContextPath()+ "/example04/login");
            return;
        }
        // session中用户存在，则证明曾经登录过
        req.getRequestDispatcher("/WEB-INF/example04/welcome.html")
                .forward(req, resp);
        LOGGER.info("用户姓名：" + user.getName());
        LOGGER.info("当前/登录时间：" + LocalDateTime.now() + "/" + user.getLoginTime());
    }
}
