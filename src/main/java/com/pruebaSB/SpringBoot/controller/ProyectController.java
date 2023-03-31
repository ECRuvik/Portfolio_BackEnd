package com.pruebaSB.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pruebaSB.SpringBoot.interfaces.IProyectService;
import com.pruebaSB.SpringBoot.model.Proyect;

@RestController
@RequestMapping("/proyects")
public class ProyectController {
    
    @Autowired
    private IProyectService proyectServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<Proyect> seeProyects () {
        return proyectServ.getProyects();
    }
    
    @PostMapping ("/add")
    public void addProyect (@RequestBody Proyect proyect) {
        proyectServ.saveProyect(proyect);
    }
    
    @PutMapping("/edit/{proyect_id}")
    public Proyect updateProyect (@RequestBody Proyect proyect, @PathVariable Long proyect_id) {
        return proyectServ.updateProyect(proyect, proyect_id);
    }
    
    @GetMapping("/id/{proyect_id}")
    public Proyect getProyectById (@PathVariable Long proyect_id) {
        return proyectServ.findProyectById(proyect_id);
    }
    
    @DeleteMapping ("/delete/{proyect_id}")
    public void deleteProyect (@PathVariable("proyect_id") Long proyect_id) {
        proyectServ.deleteProyect(proyect_id);
    }

}
