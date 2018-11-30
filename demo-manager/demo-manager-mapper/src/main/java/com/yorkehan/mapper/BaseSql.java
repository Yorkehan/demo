package com.yorkehan.mapper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseSql {
    public String ssql(Map<String,Object> map) throws IllegalAccessException {
        Object t = map.get("t");
        String view = (String) map.get("view");
        Class clazz=t.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<Object> list=new ArrayList<>();
        for (Field f :fields) {
            f.setAccessible(true);
            if (f.get(t)==null||f.get(t).equals("")){
                list.add(null);
            }else{
                list.add(f.get(t));
            }
        }
        String s="exec searchUser ";

        for (int i=0;i<list.size();i++){
            if (i==list.size()-1){
                s=s+list.get(i);
            }else {
                s=s+list.get(i)+",";
            }
        }
        System.out.println(s);
        return s;
    }
}
