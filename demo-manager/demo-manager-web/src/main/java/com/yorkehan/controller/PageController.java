package com.yorkehan.controller;


import com.yorkehan.utils.CookieUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PageController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private CookieUtil cookieUtil;
    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String indexPage(){
        return "redirect:/admin";
    }
    @RequestMapping("/admin")
    public String page(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(User user, Model model){
        UsernamePasswordToken passwordToken = new UsernamePasswordToken(user.getUserName(), user.getUserPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(passwordToken);
        }catch (Exception e){
            e.printStackTrace();
            return "login";
        }
        return "redirect:/admin";
    }
    /*
    * 获取cookie
    */

}
