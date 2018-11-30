package com.yorkehan.controller;

import com.github.pagehelper.PageInfo;
import com.yorkehan.condition.Condition;
import com.yorkehan.pojo.User;
import com.yorkehan.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController{
    @Resource
    private UserService userService;

    @RequestMapping("/getAll")
    public Map<String, Object> getAllUserList(String condition, String viewORproc, Integer page, Integer rows){
        /*List<List<Map>> list= userService.getAllUserListByProc(Integer.valueOf(page),Integer.valueOf(rows));*/
        List<List<Map>> list= userService.getBaseQuery(condition,viewORproc,page,rows);

        Map<String, Object> map = new HashMap<>();
        map.put("rows", list.get(0));
        map.put("total", list.get(1).get(0).get("TotalNum"));
        return map;
    }
    @RequestMapping("/search")
    public Map getUserByUserName(String user_name){

        Map map = userService.getUserByUserName(user_name);
        return map;
    }
}
