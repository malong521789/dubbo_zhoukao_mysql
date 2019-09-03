package com.zb.mapper;

import com.zb.entity.HouseType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseTypeMapper {
    public List<HouseType> findHouseType();
}
