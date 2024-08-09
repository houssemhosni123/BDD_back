package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.How;
import com.example.behavior_driven_development_project.Entities.Status;
import com.example.behavior_driven_development_project.Repositories.HowRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class HowServiceImpl implements IHowService {
    @Autowired
    HowRepositorie howRepositorie;

    @Override
    public List<How> getAllHows() {
        return howRepositorie.findAll();
    }

    @Override
    public Optional<How> getHowById(String idHow) {
        return howRepositorie.findById(idHow);
    }


    @Override
    public How saveHow(How how) {
        
        return howRepositorie.save(how);
    }

    @Override
    public void deleteHow(String idHow) {
        howRepositorie.deleteById(idHow);
    }

    @Override
    public How updateHow(Long idHow, How how) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }
}
