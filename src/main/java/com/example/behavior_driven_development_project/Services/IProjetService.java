package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.ProjectTaskCountDTO;
import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Status;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IProjetService {
    public List<Projet> getAllProjets();
    public Optional<Projet> getProjetById(String idProjet);
    public Projet saveProjet(Projet projet);
        public void deleteProjet(String idProjet);
    public Projet updateProjet(String idProjet, Projet projet);
    int countNotStartedProjects();
    int countInProgressProjects();
    int countCompletedProjects();
    long getNumberOfTasksForProjet(String projetId);
    List<ProjectTaskCountDTO> getAllProjectsWithTaskCounts();
    byte[] exportProjects() throws IOException;
}
