package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository <Proyect, Long> {
    
}
