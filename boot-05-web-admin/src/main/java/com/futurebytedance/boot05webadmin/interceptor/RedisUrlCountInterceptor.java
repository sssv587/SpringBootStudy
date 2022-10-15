package com.futurebytedance.boot05webadmin.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/15 - 21:41
 * @Description
 */
@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {
    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();

        //默认每次访问当前uri就会计数+1
        redisTemplate.opsForValue().increment(uri);

        return true;
    }
}
