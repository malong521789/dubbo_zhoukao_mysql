package com.zb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;

import com.zb.entity.HouseInfors;
import com.zb.entity.HouseType;

import com.zb.service.RpcHouseInforsService;

import com.zb.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HouseInforsController {

    @Reference
    private RpcHouseInforsService rpcHouseInforsService;
    @RequestMapping( value = "/person")
    @ResponseBody
    public Page<HouseInfors> show(Integer id, @RequestParam(value ="index",defaultValue = "1") Integer index, Integer size){
        size=3;
        Page<HouseInfors> page=rpcHouseInforsService.findHouseInforsByPage(id,index,size);
        return page;
    }

    @RequestMapping( value = "/add")
    @ResponseBody
    public String add(HouseInfors houseInfors,Integer id){
        HouseType houseType =new HouseType();
        houseType.setTypeId(id);
        houseInfors.setHouseType(houseType);
        int num=rpcHouseInforsService.addHouseInfors(houseInfors);
        String json= JSON.toJSONString(num);
        return json;
    }

    @RequestMapping( value = "/del")
    @ResponseBody
    public String delete(Integer houseId){
        int num=rpcHouseInforsService.deleteHouseInfors(houseId);
        String json= JSON.toJSONString(num);
        return json;
    }

    @RequestMapping( value = "/look")
    @ResponseBody
    public String look(Integer houseId){
        List<HouseInfors> list=rpcHouseInforsService.lookHouseInfors(houseId);
        String json= JSON.toJSONString(list);
        return json;
    }

    @RequestMapping( value = "/update")
    @ResponseBody
    public String update(HouseInfors houseInfors,Integer tid){
        HouseType houseType =new HouseType();
        houseType.setTypeId(tid);
        houseInfors.setHouseType(houseType);
        int num=rpcHouseInforsService.updateHouseInfors(houseInfors);
        String json= JSON.toJSONString(num);
        return json;
    }

}
