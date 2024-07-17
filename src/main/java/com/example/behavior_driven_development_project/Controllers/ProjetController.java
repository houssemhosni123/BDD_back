package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Services.IProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Projet")
public class ProjetController {
    @Autowired
    IProjetService projetService;


    @GetMapping("/getprojet")
    public List<Projet> getAllProjets() {

        return projetService.getAllProjets();
    }

    @GetMapping("getprojets/{idProjet}")
    public Projet getProjetById(@PathVariable Long idProjet) {

        return projetService.getProjetById(idProjet).orElse(null);
    }
    @PostMapping("/createprojet")
    public Projet createOrUpdateProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    @DeleteMapping("/deleteprojet/{idProjet}")
    public void deleteProjet(@PathVariable Long idProjet) {
        projetService.deleteProjet(idProjet);
    }
}
