package com.zb.entity;

import java.io.Serializable;
//杀杀杀
public class HouseInfors implements Serializable {

     private  Integer houseId; //'房屋编号',
     private String houseDesc;//'房屋描述',
    private  HouseType houseType;//'户型编号',
    private  Integer monthlyRent;//'租金',
    private String publishDate;// '发布日期',

    public HouseInfors() {
    }

    public HouseInfors(Integer houseId, String houseDesc, HouseType houseType, Integer monthlyRent, String publishDate) {
        this.houseId = houseId;
        this.houseDesc = houseDesc;
        this.houseType = houseType;
        this.monthlyRent = monthlyRent;
        this.publishDate = publishDate;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Integer monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
