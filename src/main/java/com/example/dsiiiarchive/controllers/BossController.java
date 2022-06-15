package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Boss;
import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.BossRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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
    @PutMapping("/boss/{id}")
    public Map<String, String> editBoss(@RequestBody Boss requestBoss, @PathVariable long id) {
        Optional<Boss> boss = bossRepository.findById(id);
        Map<String, String> response = new HashMap<>();

        if (boss.isPresent()) {
            boss.get().setName(requestBoss.getName());
            boss.get().setDescription(requestBoss.getDescription());
            boss.get().setHealth(requestBoss.getHealth());
            boss.get().setLore(requestBoss.getLore());
            boss.get().setImage_url(requestBoss.getImage_url());
            boss.get().setParryable(requestBoss.isParryable());
            boss.get().setOptional(requestBoss.isOptional());
            boss.get().setLocation(requestBoss.getLocation());
            response.put("message", "Boss Updated Successfully!");
            return response;
        }
        response.put("message", "Boss Not Found with Id: " + id);
        return response;
    }

    @CrossOrigin
    @DeleteMapping("/boss/{id}")
    public Map<String, String> deleteBoss(@PathVariable long id) {
        Map<String, String> response = new HashMap<>();
        bossRepository.deleteById(id);
        response.put("message", "Delete Operation Executed!");
        return response;
    }

    @CrossOrigin
    @PostMapping("/bosses")
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
