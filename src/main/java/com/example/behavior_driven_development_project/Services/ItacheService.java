package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Tache;

import java.util.List;

public interface ItacheService {
    void addTache(Tache tache, Projet projet);

    Tache UpdateTache(Tache tache, long idtache);

    List<Tache> ShowTache();

    void DeleteTache(long idtache);

    List<Tache> ShowTacheWithUserAndProjet();
}
