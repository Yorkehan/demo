package com.yorkehan.mapper.sql;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BaseSql {

    public String getAccountMsg(Map<String,Object> param){
        String sql=null;
        String tableName = (String) param.get("tableName");
        if(!StringUtils.isEmpty(tableName)){
            sql="select * from " +tableName;
        }
        String sqlwhere = (String) param.get("sqlwhere");
        if(!StringUtils.isEmpty(sqlwhere)){
            Map map = (Map) JSON.parse(sqlwhere);
            Set<String> set = map.keySet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()){
                String key = it.next();
                Object val = map.get(key);
                sql+=" where "+key+" = '"+val+"'";
            }
        }
        return sql;
    }
}
