package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.LocationRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @RequestMapping("/locations")
    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }


}

