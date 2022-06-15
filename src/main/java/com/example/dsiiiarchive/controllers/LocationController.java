package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Boss;
import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.LocationRepository;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LocationController {
    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @CrossOrigin
    @PostMapping("/locations")
    public String addLocation(@RequestBody Location location) {
        locationRepository.save(location);
        return "Location added!";
    }

    @CrossOrigin
    @GetMapping("/location/{id}")
    public Optional<Location> getLocation(@PathVariable long id) { return locationRepository.findById(id);}

    @CrossOrigin
    @GetMapping("/locations")
    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }


}

