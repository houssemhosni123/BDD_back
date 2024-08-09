package com.example.behavior_driven_development_project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Projet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;

    private String Nom_Projet;

    private String Client;

    private String Project_Manager;

    private String Description_Projet;

    @Temporal(TemporalType.DATE)
    private Date DateDebut_Projet;

    @Temporal(TemporalType.DATE)
    private Date DateFin_Projet;

    @Enumerated(EnumType.STRING)
    private Status type;
    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)

    @JsonIgnore
    private List<Tache> taches;
}
