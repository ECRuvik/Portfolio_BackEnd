package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectRepository extends JpaRepository <Proyect, Long> {
    
}
