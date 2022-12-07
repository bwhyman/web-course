package com.example05.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebFilter("/filter/*")
public class UserFilter extends HttpFilter {
    private final List<String> excludes = List.of("/filter/login");
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        // 基于请求的地址，判断是否需要排除
        for (String e : excludes) {
            if (e.equals(req.getServletPath())) {
                // 需要排除，则直接执行后续操作
                chain.doFilter(req, res);
                return;
            }
        }
        // 无需排除，则过滤判断
        User user = (User) req.getSession().getAttribute("user");
        if (user != null) {
            // 存在，允许继续访问
            chain.doFilter(req, res);
        } else {
            // 不存在，重定向到登录页面
            res.sendRedirect(req.getContextPath()+ "/filter/login");
        }
    }
}
