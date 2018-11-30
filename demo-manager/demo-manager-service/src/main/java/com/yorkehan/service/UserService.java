package com.yorkehan.service;

import com.github.pagehelper.PageInfo;
import com.yorkehan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User login(User user);

    User getUserByName(String username);

    PageInfo<User> getAllUserList(Integer integer, Integer integer1);

    Map getUserByUserName(String user_name);

    List<List<Map>> getAllUserListByProc(Integer integer, Integer integer1);

    List<List<Map>> getBaseQuery( Object o, String viewORproc, Integer page, Integer rows);
}
