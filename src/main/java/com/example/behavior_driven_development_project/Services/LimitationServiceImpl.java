package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Limitation;
import com.example.behavior_driven_development_project.Repositories.LimitationRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class LimitationServiceImpl implements ILimitationService {
    @Autowired
    LimitationRepositorie limitationRepositorie;

    @Override
    public List<Limitation> getAllLimitations() {
        return limitationRepositorie.findAll();
    }

    @Override
    public Optional<Limitation> getLimitationById(String idLimitation) {
        return limitationRepositorie.findById(idLimitation);
    }


    @Override
    public Limitation saveLimitation(Limitation limitation) {
       
        return limitationRepositorie.save(limitation);
    }

    @Override
    public void deleteLimitation(String idLimitation) {
        limitationRepositorie.deleteById(idLimitation);
    }

    @Override
    public Limitation updateLimitation(Long idLimitation, Limitation limitation) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }
}
