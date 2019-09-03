package com.zb.service;

import com.zb.entity.HouseInfors;
import com.zb.util.Page;

import java.util.List;

public interface RpcHouseInforsService {
   public Page<HouseInfors> findHouseInforsByPage(Integer id, Integer index , Integer size);

   public int addHouseInfors(HouseInfors houseInfors);

   public int deleteHouseInfors(Integer id);

   public List<HouseInfors> lookHouseInfors(Integer id);

   public int updateHouseInfors(HouseInfors houseInfors);
}
