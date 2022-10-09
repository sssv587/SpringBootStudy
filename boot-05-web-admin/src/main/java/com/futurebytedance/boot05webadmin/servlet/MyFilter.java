package com.futurebytedance.boot05webadmin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/10 - 0:11
 * @Description
 */
@Slf4j
//@WebFilter(urlPatterns = {"/css/*", "/fonts/*"})
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("MyFilter工作");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter初始化完成");
    }

    @Override
    public void destroy() {
        log.info("MyFilter销毁了");
    }
}
