package com.futurebytedance.boot05webadmin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.futurebytedance.boot05webadmin.bean.User;
import com.futurebytedance.boot05webadmin.exception.UserTooManyException;
import com.futurebytedance.boot05webadmin.service.UserService;
import com.futurebytedance.boot05webadmin.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 21:24
 * @Description
 */
@Controller
public class TableController {
    @Autowired
    UserService userService;

    /**
     * 不带请求参数或者参数类型不读 400：Bad Request 一般都是浏览器的参数没有传递正确
     *
     * @return
     */
    @GetMapping("/basic_table")
//    public String basic_table(@RequestParam("a") int a) {
    public String basic_table() {
//        int b = 10 / 0;
        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                             RedirectAttributes ra) {
        userService.removeById(id);

        ra.addAttribute("pn", pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) { //RedirectAttributes
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi", "123444"),
//                new User("haha", "aaaaa"),
//                new User("hehe", "aaddd"));
//
//        model.addAttribute("users", users);

//        if (users.size() > 3) {
//            throw new UserTooManyException();
//        }

        //从数据库中查出user表中的用户进行展示
        List<User> list = userService.list();

//        model.addAttribute("users", list);

        //分页查询数据
        Page<User> page = new Page<>(pn, 2);

        //分页查询的结果
        Page<User> userPage = userService.page(page, null);

        model.addAttribute("users", userPage);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }
}
