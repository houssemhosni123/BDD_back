package com.example.behavior_driven_development_project.Repositories;

import com.example.behavior_driven_development_project.Entities.Tache;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItacheRepositorie extends MongoRepository<Tache, String> {

    // Find a task by its ID
    Tache findTachesByIdTache(String idTache);

    // Count the number of tasks by project ID
    long countByProjet_IdProjet(String idProjet);

    // Aggregation to count roles by project
    @Aggregation(pipeline = {
            "{ '$match': { 'projet._id': ?0 } }",
            "{ '$group': { '_id': '$tacheProjet', 'count': { '$sum': 1 } } }"
    })
    List<Object[]> countRolesByProject(String projectId);
}
