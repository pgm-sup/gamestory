package com.wyc.mapper;

import com.wyc.model.GameInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GameInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GameInfo record);

    int insertSelective(GameInfo record);

    GameInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GameInfo record);

    int updateByPrimaryKey(GameInfo record);

    List<GameInfo> selectAllGame();
}