package com.futurebytedance.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/19 - 23:45
 * @Description
 */
//@Controller
//@ResponseBody
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2! 你好!";
    }
}
