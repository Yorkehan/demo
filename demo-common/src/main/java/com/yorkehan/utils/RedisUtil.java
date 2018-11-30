package com.yorkehan.utils;

import com.alibaba.fastjson.JSON;
import com.yorkehan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate redisTemplate;
    public void setUserKey(String tokenKey,User user){
        redisTemplate.opsForValue().set(tokenKey,JSON.toJSONString(user),60,TimeUnit.MINUTES);
    }
    public Object getKey(String tokenKey){
        return redisTemplate.opsForValue().get(tokenKey);
    }

}
