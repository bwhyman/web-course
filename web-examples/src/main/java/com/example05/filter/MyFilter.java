package com.example05.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
