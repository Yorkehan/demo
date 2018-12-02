package com.yorkehan.service.impl;

import com.yorkehan.mapper.dao.BaseDao;
import com.yorkehan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BaseDao baseDao;
    @Override
    public List<Map> getAccountMsg(String sqlwhere,String tableName) {
        List<Map> accountMsg = baseDao.getAccountMsg(sqlwhere,tableName);
        return accountMsg;
    }
}
