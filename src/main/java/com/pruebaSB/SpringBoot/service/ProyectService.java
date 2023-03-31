package com.pruebaSB.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebaSB.SpringBoot.interfaces.IProyectService;
import com.pruebaSB.SpringBoot.model.Proyect;
import com.pruebaSB.SpringBoot.repository.ProyectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyectService {
    
    @Autowired
    public ProyectRepository proyectRepo;
    
    @Override
    public List<Proyect> getProyects() {
        return proyectRepo.findAll();
    }

    @Override
    public void saveProyect(Proyect proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public void deleteProyect(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyect findProyectById(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public Proyect updateProyect(Proyect proyect, Long proyect_id) {
        Optional<Proyect> localProyect = proyectRepo.findById(proyect_id);
        Proyect proyecti = null;
        if (localProyect.isPresent()) {
            proyecti = localProyect.get();
            proyecti.setAbout(proyecti.getAbout());
            proyecti.setEndDate(proyecti.getEndDate());
            proyecti.setLogo_url(proyecti.getLogo_url());
            proyecti.setName(proyecti.getName());
            proyecti.setStartDate(proyecti.getStartDate());
            proyecti.setStatus(proyecti.getStatus());
            proyecti.setType(proyecti.getType());
            proyecti.setUrl(proyecti.getUrl());
            proyecti = proyectRepo.save(proyect);
        }
        return proyect;
    }
    
}
