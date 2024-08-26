package com.example.behavior_driven_development_project.Repositories;

import com.example.behavior_driven_development_project.Entities.ProjectTaskCountDTO;
import com.example.behavior_driven_development_project.Entities.Projet;
import com.example.behavior_driven_development_project.Entities.Status;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepositorie extends MongoRepository<Projet, String> {

    // Counts the number of projects by status

    // Aggregation to count the number of projects by status
    @Aggregation(pipeline = {
            "{ '$match': { 'status': ?0 } }",
            "{ '$count': 'total' }"
    })
    int countProjectsByStatus(Status status);

    // Aggregation to find all projects with their respective task counts
    @Aggregation(pipeline = {
            "{ '$lookup': { 'from': 'Tache', 'localField': '_id', 'foreignField': 'projet._id', 'as': 'taches' } }",
            "{ '$unwind': { 'path': '$taches', 'preserveNullAndEmptyArrays': true } }",
            "{ '$group': { '_id': { 'idProjet': '$_id', 'Nom_Projet': '$Nom_Projet' }, 'taskCount': { '$sum': 1 } } }",
            "{ '$project': { 'Nom_Projet': '$_id.Nom_Projet', 'taskCount': 1 } }"
    })
    List<ProjectTaskCountDTO> findAllProjectsWithTaskCounts();
}
