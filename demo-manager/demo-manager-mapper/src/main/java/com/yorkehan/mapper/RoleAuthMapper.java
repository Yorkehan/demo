package com.yorkehan.mapper;

import com.yorkehan.pojo.RoleAuth;
import com.yorkehan.pojo.RoleAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleAuthMapper {
    int countByExample(RoleAuthExample example);

    int deleteByExample(RoleAuthExample example);

    int deleteByPrimaryKey(Integer roleAuthId);

    int insert(RoleAuth record);

    int insertSelective(RoleAuth record);

    List<RoleAuth> selectByExample(RoleAuthExample example);

    RoleAuth selectByPrimaryKey(Integer roleAuthId);

    int updateByExampleSelective(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);

    int updateByExample(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);

    int updateByPrimaryKeySelective(RoleAuth record);

    int updateByPrimaryKey(RoleAuth record);
}