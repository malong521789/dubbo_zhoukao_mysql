package com.zb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
@Autowired
    private RedisTemplate redisTemplate;

    public void set(String key,Object val){
        redisTemplate.opsForValue().set(key,val);
    }

    public void set(String key, Object val,long time) {
        redisTemplate.opsForValue().set(key , val , time, TimeUnit.SECONDS);
    }
    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public boolean extsis(String key){
        return this.get(key)!=null?true:false;
    }
}
