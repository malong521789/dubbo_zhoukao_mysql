package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.zb.entity.HouseInfors;
import com.zb.mapper.HouseInforsMapper;

import com.zb.service.RpcHouseInforsService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class RpcHouseInforsServiceImpl implements RpcHouseInforsService {
    @Autowired(required = false)
    private HouseInforsMapper houseInforsMapper;
    @Override
    public Page<HouseInfors> findHouseInforsByPage(Integer id, Integer index, Integer size) {
        Page<HouseInfors> page =new Page<HouseInfors>();
        List<HouseInfors> list=houseInforsMapper.getHouseInforsInfor(id,(index-1)*size,size);
        int count=houseInforsMapper.getHouseInforsCount(id);
        page.setIndex(index);
        page.setData(list);
        page.setCount(count);
        page.setSize(size);
        return page;
    }

    @Override
    public int addHouseInfors(HouseInfors houseInfors) {
        return houseInforsMapper.addHouseInforsInfor(houseInfors);
    }

    @Override
    public int deleteHouseInfors(Integer id) {
        return houseInforsMapper.deleteHouseInforsInfor(id);
    }

    @Override
    public List<HouseInfors> lookHouseInfors(Integer id) {
        return houseInforsMapper.lookHouseInforsInfor(id);
    }

    @Override
    public int updateHouseInfors(HouseInfors houseInfors) {
        return houseInforsMapper.updateHouseInforsInfor(houseInfors);
    }
}
