package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Why;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IWhyService {
    public List<Why> getAllWhys();
    public Optional<Why> getWhyById(String idWhy);
    public Why saveWhy(Why why);
    public void deleteWhy(String idWhy);
    public Why updateWhy(Long idWhy, Why why);


    byte[] exportProjects() throws IOException;
}
