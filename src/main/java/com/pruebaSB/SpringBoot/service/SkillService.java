package com.pruebaSB.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebaSB.SpringBoot.interfaces.ISkillService;
import com.pruebaSB.SpringBoot.model.Skill;
import com.pruebaSB.SpringBoot.repository.SkillRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill findSkillById(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public Skill updateSkill(Skill skill, Long skill_id) {
        Optional<Skill> localSkill = skillRepo.findById(skill_id);
        Skill skilli = null;
        if (localSkill.isPresent()) {
            skilli = localSkill.get();
            skilli.setLevel(skilli.getLevel());
            skilli.setName(skilli.getName());
            skilli = skillRepo.save(skill);
        }
        return skill;
    }
    
}
