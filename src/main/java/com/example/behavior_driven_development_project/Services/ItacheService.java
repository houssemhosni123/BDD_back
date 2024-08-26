package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.RoleProjet;
import com.example.behavior_driven_development_project.Entities.Tache;

import java.util.List;
import java.util.Map;

public interface ItacheService {
    void addTache(Tache tache, Projet projet);

    Tache UpdateTache(Tache tache, String idtache);

    List<Tache> ShowTache();

    void DeleteTache(String idtache);

    List<Tache> ShowTacheWithUserAndProjet();
}
