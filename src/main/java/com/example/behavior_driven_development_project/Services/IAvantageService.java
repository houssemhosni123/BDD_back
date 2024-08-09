package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Avantage;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IAvantageService {
    public List<Avantage> getAllAvantage();
    public Optional<Avantage> getAvantageById(String idAvantage);
    public Avantage saveAvantage(Avantage avantage);
    public void deleteAvantage(String idAvantage);
    public Avantage updateAvantage(Long idAvantage, Avantage avantage);


    byte[] exportProjects() throws IOException;
}
