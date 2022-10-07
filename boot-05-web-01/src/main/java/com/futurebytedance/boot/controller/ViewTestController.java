package com.futurebytedance.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 20:38
 * @Description
 */
@Controller
public class ViewTestController {
    @GetMapping("/dog")
    public String dog(Model model) {
        //model中的数据会被放在请求域中 request.setAttribute("a",aa)
        model.addAttribute("msg", "你好,世界");
        model.addAttribute("link", "https://www.baidu.com");
        return "success";
    }
}
