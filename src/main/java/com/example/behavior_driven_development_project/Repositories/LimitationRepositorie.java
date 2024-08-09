package com.example.behavior_driven_development_project.Repositories;

import com.example.behavior_driven_development_project.Entities.Avantage;
import com.example.behavior_driven_development_project.Entities.Limitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface LimitationRepositorie extends JpaRepository<Limitation,String> {
}
