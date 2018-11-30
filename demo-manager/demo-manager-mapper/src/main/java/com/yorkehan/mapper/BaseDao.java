package com.yorkehan.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface BaseDao {
    @SelectProvider(type = BaseSql.class,method ="ssql")
    @ResultMap("m1,m2,m3")
    List<List<Map>> baseQuery(@Param("t") Object t,@Param("view") String view, @Param("page") Integer page,@Param("rows") Integer rows);
}
