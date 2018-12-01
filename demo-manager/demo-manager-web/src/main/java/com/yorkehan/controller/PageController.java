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
    @RequestMapping("/")
    public String indexPage(){
        return "redirect:/admin";
    }
    @RequestMapping("/admin")
    public String page(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){

        return "redirect:/admin";
    }
    /*
    * 获取cookie
    */

}
