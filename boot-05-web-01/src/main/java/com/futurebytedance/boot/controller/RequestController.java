package com.futurebytedance.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/26 - 23:18
 * @Description
 */
@Controller
public class RequestController {
    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request) {
        request.setAttribute("msg", "成功了....");
        request.setAttribute("code", 200);
        return "forward:/success"; //转发到 /success请求
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code,
                       HttpServletRequest request) {
        String msg1 = request.getAttribute("msg").toString();

        Map<String, String> map = new HashMap<>();

        map.put("requestMethod_msg", msg1);
        map.put("annotation_msg", msg);
        return map;
    }
}
