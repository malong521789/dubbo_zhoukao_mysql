package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.zb.entity.HouseType;
import com.zb.mapper.HouseTypeMapper;

import com.zb.service.RpcHouseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class RpcHouseTypeServiceImpl implements RpcHouseTypeService {
    @Autowired(required = false)
    private HouseTypeMapper houseTypeMapper;
    @Override
    public List<HouseType> getHouseType() {
        return houseTypeMapper.findHouseType();
    }
}
