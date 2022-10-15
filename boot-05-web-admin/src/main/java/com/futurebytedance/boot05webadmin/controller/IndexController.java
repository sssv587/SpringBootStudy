package com.futurebytedance.boot05webadmin.controller;

import com.futurebytedance.boot05webadmin.bean.Account;
import com.futurebytedance.boot05webadmin.bean.City;
import com.futurebytedance.boot05webadmin.bean.User;
import com.futurebytedance.boot05webadmin.service.AccountService;
import com.futurebytedance.boot05webadmin.service.CityService;
import com.futurebytedance.boot05webadmin.service.impl.AccountServiceImpl;
import com.futurebytedance.boot05webadmin.service.impl.CityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 20:51
 * @Description
 */
@Slf4j
@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/city")
    public City saveCity(City city) {
        cityService.saveCity(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id) {
        return cityService.getById(id);
    }

    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id) {
        return accountService.getAcctById(id);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from customers", Long.class);
        return aLong.toString();
    }

    /**
     * 来登录页
     *
     * @return
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser", user);
            //登陆成功重定向到main.html 重定向防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            //回到登录页面
            return "login";
        }
    }

    /**
     * 去main页面
     *
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        log.info("当前方式是:{}", "mainPage");
        //是否登录 拦截器，过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null) {
//            return "main";
//        } else {
//            //回到登录页面
//            model.addAttribute("msg", "请重新登录!");
//            return "login";
//        }
        return "main";
    }
}
