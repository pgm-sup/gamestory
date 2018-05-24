package com.wyc.service.Impl;

import com.github.pagehelper.PageHelper;
import com.wyc.mapper.GameInfoMapper;
import com.wyc.mapper.HardWareMapper;
import com.wyc.model.Comment;
import com.wyc.model.GameInfo;
import com.wyc.model.HardWare;
import com.wyc.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haima
 */
@Service
public class GameServiceImpl implements GameService{

    @Autowired
    private GameInfoMapper gameInfoMapper;

    @Autowired
    private HardWareMapper hardWareMapper;

    @Override
    public GameInfo getGameDetailById(Integer id) {
        return gameInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GameInfo> findAllGame(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return gameInfoMapper.selectAllGame();
    }

    @Override
    public List<Comment> queryCommentById(Integer id) {
        return gameInfoMapper.queryCommentById(id);
    }

    @Override
    public int insertComment(int userId, String comment, int gameId) {
        return gameInfoMapper.insertComment(userId, comment, gameId);
    }

    @Override
    public HardWare queryHardWareById(Integer id) {
        return hardWareMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<HardWare> AllHardWare(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return hardWareMapper.selectAllHardWare();
    }
}
