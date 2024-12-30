package com.santiagoperez.webapp_platapp.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data //toString, equal, getters, setters
@NoArgsConstructor// Constructor vacio
@AllArgsConstructor// Constructor completo
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String especie;
    private String colorHojas;
    private LocalDate fechaPlantacion;

    @ManyToOne
    @JoinColumn(name = "jardinero_id")
    @ToString.Exclude //Solucion loop infinito Lombok
    private Jardinero jardinero;


    @ManyToMany
    @JoinTable(name = "Planta_Prospecto",
        joinColumns = @JoinColumn(name = "planta_id"),
        inverseJoinColumns = @JoinColumn(name = "prospecto_id"))
    private List<Prospecto> prospectosAsociados;

}
