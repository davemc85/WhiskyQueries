package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value="/year/{year}")
    public List<Whisky> getWhiskiesByYear(@PathVariable int year){
        return whiskyRepository.findWhiskyByYear(year);
    }

    @GetMapping(value="/find/{age}/{distillery}")
    public List<Whisky> getWhiskiesByAgeAndDistillery(@PathVariable int age, @PathVariable String distillery){
        return whiskyRepository.findWhiskyByAgeAndDistillery(distillery, age);
    }

    @GetMapping(value="/region/{region}")
    public List<Whisky> whiskyByRegion(@PathVariable String region){
        return whiskyRepository.findWhiskyByRegion(region);
    }
}
