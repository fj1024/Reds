package com.redtravel.dao;

import com.redtravel.bean.Commoditycart;
import com.redtravel.bean.CommoditycartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditycartMapper {
    long countByExample(CommoditycartExample example);

    int deleteByExample(CommoditycartExample example);

    int insert(Commoditycart record);

    int insertSelective(Commoditycart record);

    List<Commoditycart> selectByExample(CommoditycartExample example);

    int updateByExampleSelective(@Param("record") Commoditycart record, @Param("example") CommoditycartExample example);

    int updateByExample(@Param("record") Commoditycart record, @Param("example") CommoditycartExample example);
}