package com.santiagoperez.webapp_platapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiagoperez.webapp_platapp.model.Prospecto;

@Repository
public interface ProspectoRepository extends JpaRepository <Prospecto, Long>{

}
