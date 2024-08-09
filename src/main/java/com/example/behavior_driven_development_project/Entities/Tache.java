package com.example.behavior_driven_development_project.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TacheProjet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tache implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;

    private String description;
    private String User;

    private Date dateCreation;

    private Date dateDebutTache;

    private Date dateFinTache;

    @Enumerated(EnumType.STRING)
    private RoleProjet tacheProjet;



    @ManyToOne
    @JoinColumn(name = "idProjet", referencedColumnName = "idProjet",
            insertable = true, updatable = false)
    private Projet projet;
}
