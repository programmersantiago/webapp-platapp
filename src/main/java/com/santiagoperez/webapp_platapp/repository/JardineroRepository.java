package com.santiagoperez.webapp_platapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiagoperez.webapp_platapp.model.Jardinero;

@Repository
public interface JardineroRepository extends JpaRepository<Jardinero, Long>{

}
