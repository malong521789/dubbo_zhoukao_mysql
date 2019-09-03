package com.zb.controller;

import com.alibaba.fastjson.JSON;

import com.zb.entity.HouseType;
import com.zb.service.HouseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HouseTypeController {
    @Autowired
    private HouseTypeService houseTypeService;

    @RequestMapping( value = "/show")
    @ResponseBody
    public String show(){
        List<HouseType> list=houseTypeService.getcurrentHouseType();
        String json= JSON.toJSONString(list);
        return json;
    }
}
