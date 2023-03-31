package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "skills")
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skill_id;
    private String name;
    private Long level;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_userData_id")
    private UserData userData;

    public Skill() {
    }

    public Skill(Long skill_id, String name, Long level) {
        this.skill_id = skill_id;
        this.name = name;
        this.level = level;
    }
    
}
