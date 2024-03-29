package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository <Study, Long> {
    
}
