package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.Why;
import com.example.behavior_driven_development_project.Services.IWhyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Why")
public class WhyController {
    @Autowired
    IWhyService whyService;


    @GetMapping("/getwhy")
    public List<Why> getAllWhys() {

        return whyService.getAllWhys();
    }

    @GetMapping("getwhys/{idWhy}")
    public Why getWhyById(@PathVariable String idWhy) {

        return whyService.getWhyById(idWhy).orElse(null);
    }
    @PostMapping("/createwhy")
    public Why createOrUpdateWhy(@RequestBody Why why) {
        return whyService.saveWhy(why);
    }

    @DeleteMapping("/deletewhy/{idWhy}")
    public void deleteWhy(@PathVariable String idWhy) {
        whyService.deleteWhy(idWhy);
    }
}
