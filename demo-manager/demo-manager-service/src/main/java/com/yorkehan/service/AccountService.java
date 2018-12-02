package com.yorkehan.service;

import java.util.List;
import java.util.Map;

public interface AccountService {
    List<Map> getAccountMsg(String sqlwhere,String tableName);
}
