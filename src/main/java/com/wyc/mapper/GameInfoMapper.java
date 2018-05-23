package com.wyc.mapper;

import com.wyc.model.Comment;
import com.wyc.model.GameInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    List<Comment> queryCommentById(Integer id);

    /**
     *
     * @param userId
     * @param comment
     * @param gameId
     * @return
     */
    int insertComment(@Param("userId") Integer userId, @Param("comment") String comment, @Param("gameId") Integer gameId);
}