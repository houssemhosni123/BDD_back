package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.ProjectTaskCountDTO;
import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Status;
import com.example.behavior_driven_development_project.Repositories.ItacheRepositorie;
import com.example.behavior_driven_development_project.Repositories.ProjetRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@Service
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    ProjetRepositorie projetRepositorie;
    @Autowired
    ItacheRepositorie tacheRepository;

    public long getNumberOfTasksForProjet(String projetId) {
        return tacheRepository.countByProjet_IdProjet(projetId);
    }
    public List<ProjectTaskCountDTO> getAllProjectsWithTaskCounts() {
        return projetRepositorie.findAllProjectsWithTaskCounts();
    }
    @Override
    public List<Projet> getAllProjets() {
        return projetRepositorie.findAll();
    }

    @Override
    public Optional<Projet> getProjetById(String idProjet) {
        return projetRepositorie.findById(idProjet);
    }


    @Override
    public Projet saveProjet(Projet projet) {
        if (projet.getType() == null) {
            projet.setType(Status.NOT_STARTED);
        }
        return projetRepositorie.save(projet);
    }

    @Override
    public void deleteProjet(String idProjet) {
        projetRepositorie.deleteById(idProjet);
    }

    @Override
    public Projet updateProjet(String idProjet, Projet projet) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }

    public int countNotStartedProjects() {
        return projetRepositorie.countProjectsByStatus(Status.NOT_STARTED);
    }

    public int countInProgressProjects() {
        return projetRepositorie.countProjectsByStatus(Status.IN_PROGRESS);
    }

    public int countCompletedProjects() {
        return projetRepositorie.countProjectsByStatus(Status.COMPLETED);
    }













}
