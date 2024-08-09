package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.How;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IHowService {
    public List<How> getAllHows();
    public Optional<How> getHowById(String idHow);
    public How saveHow(How how);
    public void deleteHow(String idHow);
    public How updateHow(Long idHow, How how);


    byte[] exportProjects() throws IOException;
}
