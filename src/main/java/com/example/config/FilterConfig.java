package com.example.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuyue
 * @date 2020/9/25 9:30
 * 过滤器配置类
 */
@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean crossFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CrossFilter());
        registration.addUrlPatterns("/*");
        registration.setName("crossFilter");
        registration.setOrder(1);
        return registration;
    }

}
