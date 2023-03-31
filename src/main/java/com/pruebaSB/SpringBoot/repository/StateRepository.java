package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository <State, Long> {
    
}
