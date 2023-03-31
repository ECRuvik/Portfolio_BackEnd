package com.pruebaSB.SpringBoot.interfaces;

import com.pruebaSB.SpringBoot.model.Skill;
import java.util.List;

public interface ISkillService {
    
    // Trae lista de usuarios
    public List<Skill> getSkills ();
    
    // Añade un usuario
    public void saveSkill (Skill skill);
    
    // Elimina un usuario
    public void deleteSkill (Long id);
    
    // Busca un usuario
    public Skill findSkillById (Long id);
    
    // Actualiza un usuario
    public Skill updateSkill(Skill skill, Long skill_id);
    
}
