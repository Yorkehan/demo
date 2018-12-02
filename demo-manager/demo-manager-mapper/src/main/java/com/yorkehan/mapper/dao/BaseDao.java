package com.yorkehan.mapper.dao;

import com.yorkehan.mapper.sql.BaseSql;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

public interface BaseDao {

    @SelectProvider(type = BaseSql.class,method = "getAccountMsg")
    @ResultType(Map.class)
    List<Map> getAccountMsg(@Param("sqlwhere") String sqlwhere,@Param("tableName") String tableName);
}
