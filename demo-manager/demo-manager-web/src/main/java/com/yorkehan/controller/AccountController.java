package com.yorkehan.controller;

import com.yorkehan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/getAccountMsg")
    public Object getAccountMsg(String sqlwhere,String tableName){
        List<Map> accountMsg = accountService.getAccountMsg(sqlwhere, tableName);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",accountMsg.size());
        map.put("data",accountMsg);
        return map;
    }
}
