package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Limitation;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ILimitationService {
    public List<Limitation> getAllLimitations();
    public Optional<Limitation> getLimitationById(String idLimitation);
    public Limitation saveLimitation(Limitation limitation);
    public void deleteLimitation(String idLimitation);
    public Limitation updateLimitation(Long idLimitation, Limitation limitation);


    byte[] exportProjects() throws IOException;
}
