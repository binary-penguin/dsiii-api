package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Boss;
import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.BossRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BossController {
    private final BossRepository bossRepository;


    public BossController(BossRepository bossRepository) {
        this.bossRepository = bossRepository;
    }

    @CrossOrigin
    @GetMapping("/boss/{id}")
    public Optional<Boss> getBoss(@PathVariable long id) {
        return bossRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping(path = "/bosses")
    public String addBoss(@RequestBody Boss boss) {
        bossRepository.save(boss);
        return "Boss added!";
    }

    @CrossOrigin
    @GetMapping("/bosses")
    public Iterable<Boss> getBosses() {
        return bossRepository.findAll();
    }


}
