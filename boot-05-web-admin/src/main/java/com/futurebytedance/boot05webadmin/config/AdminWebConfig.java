package com.futurebytedance.boot05webadmin.config;

import com.futurebytedance.boot05webadmin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 23:45
 * @Description
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中(实现WebMvcConfigurer的addInterceptors)
 * 3、指定拦截规则 [如果是拦截所有，那么静态资源也会被拦截]
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //所有请求都被拦截包括静态资源
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**"); //放行的请求
    }
}
