package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository <State, Long> {
    
}
