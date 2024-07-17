package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Status;
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

    @Override
    public List<Projet> getAllProjets() {
        return projetRepositorie.findAll();
    }

    @Override
    public Optional<Projet> getProjetById(Long idProjet) {
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
    public void deleteProjet(Long idProjet) {
        projetRepositorie.deleteById(idProjet);
    }

    @Override
    public Projet updateProjet(Long idProjet, Projet projet) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }
}
