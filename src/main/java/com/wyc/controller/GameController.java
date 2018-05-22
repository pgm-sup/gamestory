package com.wyc.controller;


import com.wyc.model.GameInfo;
import com.wyc.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author haima
 */
@Controller
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private GameService gameService;


    @ResponseBody
    @RequestMapping(value = "/queryById/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public GameInfo queryOneById(@PathVariable("id")  Integer id){
        return gameService.getGameDetailById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/queryAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<GameInfo> queryAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return gameService.findAllGame(pageNum,pageSize);
    }
}
