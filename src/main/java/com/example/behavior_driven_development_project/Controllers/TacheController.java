package com.example.behavior_driven_development_project.Controllers;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Tache;
import com.example.behavior_driven_development_project.Services.TacheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tache")
public class TacheController
{
    @Autowired
    TacheServices Tservice;

    @PostMapping("/ajouterTache")
    public ResponseEntity<Void> addTache(@RequestBody Tache tache) {
        try {
            // Fetch the user and project objects from the tache object
            Projet projet = tache.getProjet();

            // Call the addTache method in the service layer
            Tservice.addTache(tache, projet);

            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle exceptions
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



    @GetMapping("/GetTache/")
    List<Tache> ShowAllTache() {
        return Tservice.ShowTache();
    }
    // Endpoint to get tasks by project ID and user ID


    @PutMapping("/Updatetache/{id}")
    Tache UpdateTache(@RequestBody Tache tache, @PathVariable("id") long idtache) {
        return Tservice.UpdateTache(tache,idtache);
    }

    @DeleteMapping("/Deletetache/{id}")
    void DeleteIteration( @PathVariable("id") long idtache)
    {
        Tservice.DeleteTache(idtache);

    }

    @GetMapping("/GetTache/{idTache}")
    Tache getTacheById(@PathVariable Long idTache) {
        return Tservice.getTachesById(idTache);
    }

}
