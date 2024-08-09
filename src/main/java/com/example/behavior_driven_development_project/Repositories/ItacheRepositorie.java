package com.example.behavior_driven_development_project.Repositories;

import com.example.behavior_driven_development_project.Entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItacheRepositorie extends JpaRepository<Tache,Long> {
    Tache findTachesByIdTache(long idtache);


}
