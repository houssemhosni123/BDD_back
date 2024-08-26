package com.example.behavior_driven_development_project.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "How")
public class How implements Serializable {

    @Id
    private Long id;

    private String text;
}
