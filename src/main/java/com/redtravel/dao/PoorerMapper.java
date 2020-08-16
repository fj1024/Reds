package com.redtravel.dao;

import com.redtravel.bean.Poorer;
import com.redtravel.bean.PoorerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoorerMapper {
    long countByExample(PoorerExample example);

    int deleteByExample(PoorerExample example);

    int insert(Poorer record);

    int insertSelective(Poorer record);

    List<Poorer> selectByExample(PoorerExample example);

    int updateByExampleSelective(@Param("record") Poorer record, @Param("example") PoorerExample example);

    int updateByExample(@Param("record") Poorer record, @Param("example") PoorerExample example);
}