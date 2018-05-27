package com.wyc.mapper;

import com.wyc.model.HardWare;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author haima
 */
@Mapper
public interface HardWareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HardWare record);

    int insertSelective(HardWare record);

    HardWare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HardWare record);

    int updateByPrimaryKey(HardWare record);

    List<HardWare> selectAllHardWare();

    String queryRank(@Param("type") String type);
}