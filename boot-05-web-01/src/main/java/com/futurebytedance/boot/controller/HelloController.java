package com.futurebytedance.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/25 - 22:48
 * @Description
 */
@RestController
public class HelloController {
    @RequestMapping("/bug.jpg")
    public String hello() {
        return "aaaa";
    }
}
