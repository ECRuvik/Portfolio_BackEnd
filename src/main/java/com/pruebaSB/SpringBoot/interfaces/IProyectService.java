package com.pruebaSB.SpringBoot.interfaces;

import com.pruebaSB.SpringBoot.model.Proyect;
import java.util.List;

public interface IProyectService {
    
    // Trae lista de usuarios
    public List<Proyect> getProyect ();
    
    // Añade un usuario
    public void saveProyect (Proyect proyect);
    
    // Elimina un usuario
    public void deleteProyect (Long id);
    
    // Busca un usuario
    public Proyect findProyectById (Long id);
    
    // Actualiza un usuario
    public Proyect updateProyect(Proyect proyect, Long proyect_id);
    
}
