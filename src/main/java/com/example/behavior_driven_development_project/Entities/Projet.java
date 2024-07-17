package com.example.behavior_driven_development_project.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "Projet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjet;
    String Nom_Projet;
    String Client;
    String Project_Manager;
    String Description_Projet;
    Date DateDebut_Projet;
    Date DateFin_Projet;
    @Enumerated(EnumType.STRING)
    private Status type;
}
