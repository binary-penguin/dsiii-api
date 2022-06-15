package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.LocationRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LocationController {
    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @CrossOrigin
    @RequestMapping("/locations")
    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping("/location/{id}")
    public Optional<Location> getLocation(@PathVariable long id) { return locationRepository.findById(id);}
}

