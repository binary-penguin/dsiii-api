package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Boss;
import com.example.dsiiiarchive.repositories.BossRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BossController {
    private final BossRepository bossRepository;


    public BossController(BossRepository bossRepository) {
        this.bossRepository = bossRepository;
    }

    @CrossOrigin
    @RequestMapping("/bosses")
    public Iterable<Boss> getBosses() {
        return bossRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping("/boss/{id}")
    public Optional<Boss> getBoss(@PathVariable long id) {
        return bossRepository.findById(id);
    }
}
