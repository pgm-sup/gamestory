package com.wyc.controller;


import com.wyc.model.Comment;
import com.wyc.model.GameInfo;
import com.wyc.service.GameService;
import org.apache.coyote.OutputBuffer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author haima
 */
@CrossOrigin
@Controller
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private GameService gameService;


    @ResponseBody
    @RequestMapping(value = "/queryGameById/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public GameInfo queryOneById(@PathVariable("id")  Integer id){
        return gameService.getGameDetailById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/queryCommentById/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<Comment> queryCommentById(@PathVariable("id")  Integer id){
        return gameService.queryCommentById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/queryGameAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<GameInfo> queryAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return gameService.findAllGame(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/insertComment", method = RequestMethod.POST)
    public int insertComment(@RequestParam("userId") int userId, @RequestParam("comment") String comment, @RequestParam("gameId") int gameId){
        return gameService.insertComment(userId, comment, gameId);
    }
}
