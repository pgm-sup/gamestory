package com.wyc.mapper;

import com.wyc.model.GameInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haima
 */
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