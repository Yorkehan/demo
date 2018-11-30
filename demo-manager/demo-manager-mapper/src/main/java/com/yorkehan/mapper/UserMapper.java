package com.yorkehan.mapper;

import com.yorkehan.pojo.User;
import com.yorkehan.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    Map getUserByUserName(@Param("user_name") String user_name);

    List<List<Map>> getAllUserListByProc(@Param("email") String o, @Param("phoneNumber") String o1);
}