package com.example05.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebFilter("/filter/*")
public class UserFilter extends HttpFilter {
    private final List<String> exculdes = List.of("/filter/login");
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        // 基于请求的地址，判断是否需要排除
        for (String e : exculdes) {
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
            res.sendRedirect("/filter/login");
        }
    }
}
