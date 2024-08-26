package com.example.behavior_driven_development_project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Projet")
public class Projet implements Serializable {

    @Id
    private String idProjet;  // MongoDB uses String for IDs by default

    private String Nom_Projet;

    private String Client;

    private String Project_Manager;

    private String Description_Projet;

    private Date DateDebut_Projet;

    private Date DateFin_Projet;

    private Status type;

    // Reference to the list of Tache documents
    @DBRef
    @JsonIgnore
    private List<Tache> taches;

    // Methods for statistics
}
