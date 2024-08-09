package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.Limitation;
import com.example.behavior_driven_development_project.Services.ILimitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Limitation")
public class LimitationController {
    @Autowired
    ILimitationService limitationService;


    @GetMapping("/getlimitation")
    public List<Limitation> getAllLimitations() {

        return limitationService.getAllLimitations();
    }

    @GetMapping("getlimitations/{idLimitation}")
    public Limitation getLimitationById(@PathVariable String idLimitation) {

        return limitationService.getLimitationById(idLimitation).orElse(null);
    }
    @PostMapping("/createlimitation")
    public Limitation createOrUpdateLimitation(@RequestBody Limitation limitation) {
        return limitationService.saveLimitation(limitation);
    }

    @DeleteMapping("/deletelimitation/{idLimitation}")
    public void deleteLimitation(@PathVariable String idLimitation) {
        limitationService.deleteLimitation(idLimitation);
    }
}
