package com.zb.mapper;

import com.zb.entity.HouseInfors;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HouseInforsMapper {

    public List<HouseInfors> getHouseInforsInfor(@Param(value = "id") Integer id,
                                            @Param(value = "index")Integer index ,
                                            @Param(value = "size")Integer size);

    public int getHouseInforsCount(@Param(value = "id") Integer id);


    public int addHouseInforsInfor(HouseInfors houseInfors);

    public int deleteHouseInforsInfor(Integer id);

    public List<HouseInfors> lookHouseInforsInfor(Integer id);

    public int updateHouseInforsInfor(HouseInfors houseInfors);
}
