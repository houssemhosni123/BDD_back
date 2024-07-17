package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Projet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IProjetService {
    public List<Projet> getAllProjets();
    public Optional<Projet> getProjetById(Long idProjet);
    public Projet saveProjet(Projet projet);
    public void deleteProjet(Long idProjet);
    public Projet updateProjet(Long idProjet, Projet projet);


    byte[] exportProjects() throws IOException;
}
