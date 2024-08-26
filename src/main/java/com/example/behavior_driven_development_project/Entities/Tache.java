package com.example.behavior_driven_development_project.Entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Tache")
public class Tache implements Serializable {

    @Id
    private String idTache;  // MongoDB uses String for IDs by default

    private String description;

    private String User;

    private Date dateCreation;

    private Date dateDebutTache;

    private Date dateFinTache;

    private RoleProjet tacheProjet;

    // Reference back to the Projet document
    @DBRef
    private Projet projet;
}
