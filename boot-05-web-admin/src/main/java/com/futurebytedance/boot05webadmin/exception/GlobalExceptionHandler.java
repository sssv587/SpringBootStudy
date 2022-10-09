package com.futurebytedance.boot05webadmin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/9 - 23:30
 * @Description 处理整个WebController的异常
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class}) //处理异常
    public String handleArithException(Exception e) {
        log.error("异常是：{}", e);
        return "login"; //视图地址
    }
}
