package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.RoleProjet;
import com.example.behavior_driven_development_project.Entities.Tache;
import com.example.behavior_driven_development_project.Repositories.ItacheRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
public class TacheServices  implements ItacheService {
    @Autowired
    ItacheRepositorie TRepository;

    @Autowired
    ItacheRepositorie pR;

    @Override
    public void addTache(Tache tache, Projet projet) {
        // Set user and project objects directly in the tache
        tache.setProjet(projet);

        // Set creation date for the task
        tache.setDateCreation(new Date());

        // Save the task
        TRepository.save(tache);
    }

    @Override
    public Tache UpdateTache(Tache tache, String idtache) {
        tache =TRepository.findTachesByIdTache(idtache);
        return TRepository.save(tache);
    }



    // Method to count tasks for each user

    /*@Override
    public List<Tache> ShowTache() {
        return TRepository.findAll();
    }*/
    @Override
    public List<Tache> ShowTache() {
        return TRepository.findAll();
    }



    @Override
    public void DeleteTache(String idtache) {
        // Attempt to find the task by ID
        Tache tache = TRepository.findTachesByIdTache(idtache);

        if (tache != null) {
            // If the task is found, delete it from the repository
            TRepository.delete(tache);
        } else {
            // Handle the case where the task with the specified ID is not found
            throw new NoSuchElementException("Task with ID " + idtache + " not found");
        }
    }


    @Override
    public List<Tache> ShowTacheWithUserAndProjet() {
        return null;
    }





    public Tache getTachesById(String idTache) {
        return TRepository.findById(idTache).orElse(null);
    }

}
