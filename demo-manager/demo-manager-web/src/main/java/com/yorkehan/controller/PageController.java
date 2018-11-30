package com.yorkehan.controller;


import com.alibaba.fastjson.JSON;
import com.yorkehan.pojo.User;
import com.yorkehan.service.UserService;
import com.yorkehan.utils.CookieUtil;
import com.yorkehan.utils.RedisUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    public String indexPage(Model model,HttpServletRequest request){
        /*String token = cookieUtil.getTocken(request,"token");
        if(token!=null&&!token.equals("")){
            Object o = redisUtil.getKey(token);
            if(o!=null) {
                return "index";
            }
        }*/

        return "index";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
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
        return "redirect:/";
    }
    /*
    * 获取cookie
    */

}
