package com.wyc.service;

import com.wyc.model.Comment;
import com.wyc.model.GameInfo;

import java.util.List;

/**
 * @author haima
 */
public interface GameService {

    GameInfo getGameDetailById(Integer id);


    List<GameInfo> findAllGame(int pageNum, int pageSize);

    List<Comment> queryCommentById(Integer id);

    int insertComment(int userId, String comment, int gameId);
}
