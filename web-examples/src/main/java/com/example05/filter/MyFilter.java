package com.example05.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebFilter("/filter/*")
public class MyFilter extends HttpFilter {
    private static final Logger LOGGER = Logger.getLogger(MyFilter.class.getName());
    @Override
    protected void doFilter(HttpServletRequest req,
                            HttpServletResponse res,
                            FilterChain chain) throws IOException, ServletException {
        LOGGER.info("filter start");
        // 获取请求地址
        LOGGER.info(req.getServletPath());
        chain.doFilter(req, res);
        LOGGER.info("filter end");

    }
}
