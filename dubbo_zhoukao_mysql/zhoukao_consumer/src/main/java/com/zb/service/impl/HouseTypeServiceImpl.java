package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;

import com.zb.entity.HouseType;
import com.zb.service.HouseTypeService;

import com.zb.service.RpcHouseTypeService;
import com.zb.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class HouseTypeServiceImpl implements HouseTypeService {
    @Reference
    private RpcHouseTypeService rpcHouseTypeService;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public List<HouseType> getcurrentHouseType() {
        String key="tkey";
        List<HouseType> list=null;
        if(redisUtil.extsis(key)){
            System.out.println("redis-------->");
            String json=redisUtil.get(key).toString();
            list= JSON.parseArray(json,HouseType.class);
            return list;
        }else{
            System.out.println("bd-------->");
            list=rpcHouseTypeService.getHouseType();
            String json= JSON.toJSONString(list);
            redisUtil.set(key,json,3600);
        }
        return list;
    }
}
