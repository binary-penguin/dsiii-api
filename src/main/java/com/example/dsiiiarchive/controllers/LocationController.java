package com.example.dsiiiarchive.controllers;

import com.example.dsiiiarchive.domain.Boss;
import com.example.dsiiiarchive.domain.Location;
import com.example.dsiiiarchive.repositories.LocationRepository;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class LocationController {
    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @CrossOrigin
    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @CrossOrigin
    @GetMapping("/location/{id}")
    public Optional<Location> getLocation(@PathVariable long id) { return locationRepository.findById(id);}

    @PutMapping("/location/{id}")
    public Map<String, String> updateLocation(@PathVariable long id, @RequestBody Location requestLocation) {
        Optional<Location> locationToUpdate = locationRepository.findById(id);
        Map<String, String> response = new HashMap<>();

        if (locationToUpdate.isPresent()) {
            locationToUpdate.get().setName(requestLocation.getName());
            locationToUpdate.get().setDescription(requestLocation.getDescription());
            locationToUpdate.get().setImage_url(requestLocation.getImage_url());
            response.put("message", "Location Updated Successfully!");
            return response;
        }
        response.put("message", "Location Not Found with Id: " + id + "");
        return response;
    }

    @CrossOrigin
    @DeleteMapping("/location/{id}")
    public Map<String, String> deleteLocation(@PathVariable long id) {
        Map<String, String> response = new HashMap<>();
        locationRepository.deleteById(id);
        response.put("message", "Delete Operation Executed!");
        return response;
    }

    @CrossOrigin
    @GetMapping("/locations")
    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }


}

