package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Game;
import com.example.dsiiiarchive.repositories.GameRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    @CrossOrigin
    @RequestMapping("/gameinfo")
    public Game getGameInfo() {
        return gameRepository.findAll().iterator().next();
    }

    @CrossOrigin
    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

}
