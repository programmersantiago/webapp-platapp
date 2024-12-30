package com.santiagoperez.webapp_platapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.santiagoperez.webapp_platapp.model.Jardinero;
import com.santiagoperez.webapp_platapp.model.Planta;

@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long> {

    Optional<Planta> findEspecie(String especie);

    @Query("SELECT p FROM Planta p ORDER BY LOWER(p.especie) ASC")
    List<Planta> findAllByOrderByEspecieIgnoreCaseAsc();

    void deleteByJardinero(Jardinero jardinero);

}
