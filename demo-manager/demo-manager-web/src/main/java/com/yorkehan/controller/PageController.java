package com.yorkehan.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {
    @RequestMapping("/")
    public String indexPage(){
        return "redirect:/admin";
    }
    @RequestMapping("/admin")
    public String admin(){
        return "index";
    }
    @RequestMapping("/admin/{page}")
    public String page(@PathVariable("page") String page){
        return "/admin/"+page;
    }
    @RequestMapping("/admin/content/{page}")
    public String contentpage(@PathVariable("page") String page){
        return "/admin/content/"+page;
    }
    @RequestMapping("/login")
    public String login(){
        return "redirect:/admin";
    }

}
