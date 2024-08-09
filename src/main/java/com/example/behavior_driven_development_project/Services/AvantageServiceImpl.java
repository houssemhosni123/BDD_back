package com.example.behavior_driven_development_project.Services;

import com.example.behavior_driven_development_project.Entities.Avantage;
import com.example.behavior_driven_development_project.Entities.Status;
import com.example.behavior_driven_development_project.Repositories.AvantageRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class AvantageServiceImpl implements IAvantageService {
    @Autowired
    AvantageRepositorie avantageRepositorie;

    @Override
    public List<Avantage> getAllAvantage() {
        return avantageRepositorie.findAll();
    }

    @Override
    public Optional<Avantage> getAvantageById(String idAvantage) {
        return avantageRepositorie.findById(idAvantage);
    }


    @Override
    public Avantage saveAvantage(Avantage avantage) {

        return avantageRepositorie.save(avantage);
    }

    @Override
    public void deleteAvantage(String idAvantage) {
        avantageRepositorie.deleteById(idAvantage);
    }

    @Override
    public Avantage updateAvantage(Long idAvantage, Avantage avantage) {
        return null;
    }

    @Override
    public byte[] exportProjects() throws IOException {
        return new byte[0];
    }
}
