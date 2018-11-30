package com.yorkehan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yorkehan.condition.Condition;
import com.yorkehan.mapper.BaseDao;
import com.yorkehan.mapper.UserMapper;
import com.yorkehan.pojo.User;
import com.yorkehan.pojo.UserExample;
import com.yorkehan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BaseDao baseDao;
    @Override
    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteria1 = criteria.andUserNameEqualTo(user.getUserName());
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()>0){
            User user1 = users.get(0);
            if(user.getUserPassword().equals(user1.getUserPassword())){
                return user1;
            }
        }
        return null;
    }

    @Override
    public User getUserByName(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteria1 = criteria.andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()>0){
                return users.get(0);
        }
        return null;
    }

    @Override
    public PageInfo<User> getAllUserList(Integer page, Integer rows) {
        UserExample userExample = new UserExample();
        PageHelper.startPage(page,rows);
        List<User> list = userMapper.selectByExample(userExample);
        PageInfo<User> userPageInfo = new PageInfo<>(list);
        return userPageInfo;
    }

    @Override
    public Map getUserByUserName(String user_name) {
        Map map=userMapper.getUserByUserName(user_name);
        return map;
    }

    @Override
    public  List<List<Map>> getAllUserListByProc(Integer page, Integer rows) {

        List<List<Map>> list=userMapper.getAllUserListByProc(null,null);

        return list;
    }

    @Override
    public List<List<Map>> getBaseQuery(Object o, String viewORproc, Integer page, Integer rows) {
        return baseDao.baseQuery(o,viewORproc,page,rows);
    }

}


