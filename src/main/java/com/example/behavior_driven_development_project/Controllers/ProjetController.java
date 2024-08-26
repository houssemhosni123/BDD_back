package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.ProjectTaskCountDTO;
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
    public Projet getProjetById(@PathVariable String idProjet) {

        return projetService.getProjetById(idProjet).orElse(null);
    }
    @PostMapping("/createprojet")
    public Projet createOrUpdateProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    @DeleteMapping("/deleteprojet/{idProjet}")

    public void deleteProjet(@PathVariable String idProjet) {
        projetService.deleteProjet(idProjet);
    }
    // Endpoint to get the count of Not Started projects
    @GetMapping("/count/not-started")
    public int countNotStartedProjects() {
        return projetService.countNotStartedProjects();
    }

    // Endpoint to get the count of In Progress projects
    @GetMapping("/count/in-progress")
    public int countInProgressProjects() {
        return projetService.countInProgressProjects();
    }

    // Endpoint to get the count of Completed projects
    @GetMapping("/count/completed")
    public int countCompletedProjects() {
        return projetService.countCompletedProjects();
    }

    @GetMapping("/{idProjet}/tasks/count")
    public long getNumberOfTasksForProjet(@PathVariable String idProjet) {
        return projetService.getNumberOfTasksForProjet(idProjet);
    }







    @GetMapping("/all-projects-with-task-counts")
    public List<ProjectTaskCountDTO> getAllProjectsWithTaskCounts() {
        return projetService.getAllProjectsWithTaskCounts();
    }











}
