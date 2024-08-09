package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Why;
import com.example.behavior_driven_development_project.Entities.Status;
import com.example.behavior_driven_development_project.Repositories.WhyRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class WhyServiceImpl implements IWhyService {
    @Autowired
    WhyRepositorie whyRepositorie;

    @Override
    public List<Why> getAllWhys() {
        return whyRepositorie.findAll();
    }

    @Override
    public Optional<Why> getWhyById(String idWhy) {
        return whyRepositorie.findById(idWhy);
    }


    @Override
    public Why saveWhy(Why why) {
        
        return whyRepositorie.save(why);
    }

    @Override
    public void deleteWhy(String idWhy) {
        whyRepositorie.deleteById(idWhy);
    }

    @Override
    public Why updateWhy(Long idWhy, Why why) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }
}
