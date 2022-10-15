package com.futurebytedance.boot05webadmin.config;

import com.futurebytedance.boot05webadmin.interceptor.LoginInterceptor;
import com.futurebytedance.boot05webadmin.interceptor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 23:45
 * @Description 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中(实现WebMvcConfigurer的addInterceptors)
 * 3、指定拦截规则 [如果是拦截所有，那么静态资源也会被拦截]
 * <p>
 * EnableWebMvc:全面接管SpringMVC
 * 1、静态资源? 视图解析器? 欢迎页。。。 全部失效
 */
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    /**
     * Filter、Interceptor 几乎拥有相同的功能
     * 1、Filter是Servlet定义的原生组件。好处，脱离Spring应用也能使用
     * 2、Interceptor是Spring定义的接口。可以使用Spring的自动装配等功能
     */
    @Autowired
    RedisUrlCountInterceptor redisUrlCountInterceptor;

    /**
     * 访问 /aa/** 都去classpath:/static/ 下面进行匹配
     *
     * @param registry
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/aa/**")
//                .addResourceLocations("classpath:/static/");
//    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //所有请求都被拦截包括静态资源
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**", "/aa/**", "/sql/**", "/acct"
                        , "/city/**"); //放行的请求
        registry.addInterceptor(redisUrlCountInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**");
    }

//    @Bean
//    public WebMvcRegistrations webMvcRegistrations() {
//        return new WebMvcRegistrations() {
//            @Override
//            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
//                return null;
//            }
//        };
//    }
}
