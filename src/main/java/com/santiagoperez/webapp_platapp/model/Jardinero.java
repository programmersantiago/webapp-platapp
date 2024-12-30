package com.santiagoperez.webapp_platapp.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // toString, equal, getters, setters
@NoArgsConstructor // Constructor vacio
@AllArgsConstructor // Constructor completo
public class Jardinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String especialidad;
    private String email;

    @OneToMany(mappedBy = "jardinero", fetch = FetchType.EAGER)
    private List<Planta> plantasAsociadas;

}
