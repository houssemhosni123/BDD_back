package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.Avantage;
import com.example.behavior_driven_development_project.Entities.Avantage;
import com.example.behavior_driven_development_project.Services.IAvantageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Avantage")
public class AvantageController {
    @Autowired
    IAvantageService avantageService;


    @GetMapping("/getavantage")
    public List<Avantage> getAllAvantages() {

        return avantageService.getAllAvantage();
    }

    @GetMapping("getavantages/{idAvantage}")
    public Avantage getAvantageById(@PathVariable String idAvantage) {

        return avantageService.getAvantageById(idAvantage).orElse(null);
    }
    @PostMapping("/createavantage")
    public Avantage createOrUpdateAvantage(@RequestBody Avantage avantage) {
        return avantageService.saveAvantage(avantage);
    }

    @DeleteMapping("/deleteavantage/{idAvantage}")
    public void deleteAvantage(@PathVariable String idAvantage) {
        avantageService.deleteAvantage(idAvantage);
    }
}
