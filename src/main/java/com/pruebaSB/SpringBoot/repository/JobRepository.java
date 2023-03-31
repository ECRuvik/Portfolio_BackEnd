package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository <Job, Long> {
    
}
