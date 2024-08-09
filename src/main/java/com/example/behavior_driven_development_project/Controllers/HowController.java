package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.How;
import com.example.behavior_driven_development_project.Services.IHowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/How")
public class HowController {
    @Autowired
    IHowService howService;


    @GetMapping("/gethow")
    public List<How> getAllHows() {

        return howService.getAllHows();
    }

    @GetMapping("gethows/{idHow}")
    public How getHowById(@PathVariable String idHow) {

        return howService.getHowById(idHow).orElse(null);
    }
    @PostMapping("/createhow")
    public How createOrUpdateHow(@RequestBody How how) {
        return howService.saveHow(how);
    }

    @DeleteMapping("/deletehow/{idHow}")
    public void deleteHow(@PathVariable String idHow) {
        howService.deleteHow(idHow);
    }
}
