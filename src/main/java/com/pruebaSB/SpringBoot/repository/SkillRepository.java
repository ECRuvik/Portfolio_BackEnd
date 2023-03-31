package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository <Skill, Long> {
    
}
