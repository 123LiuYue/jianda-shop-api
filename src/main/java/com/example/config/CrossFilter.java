package com.example.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liuyue
 * @date 2020/9/15 17:16
 * 跨域请求 filter（用来添加跨域header）
 */
public class CrossFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        // 配置跨域信息
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        // 判定是否为跨域预检请求
        if (httpRequest.getMethod().equals("OPTIONS")) {
            httpResponse.setHeader("Access-Control-Allow-Methods", "*");
            httpResponse.setHeader("Access-Control-Max-Age", "3600");
            httpResponse.setHeader("Access-Control-Allow-Headers", "*");
            httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
            // 预检跨域请求直接返回
            return;
        }
        filterChain.doFilter(httpRequest, httpResponse);
    }

    @Override
    public void destroy() {

    }
}
