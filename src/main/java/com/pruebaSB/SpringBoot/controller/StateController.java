package com.pruebaSB.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pruebaSB.SpringBoot.interfaces.IStateService;
import com.pruebaSB.SpringBoot.model.State;

@RestController
@RequestMapping("/states")
public class StateController {
    
    @Autowired
    private IStateService stateServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<State> seeStates () {
        return stateServ.getStates();
    }
    
    @PostMapping ("/add")
    public void addState (@RequestBody State state) {
        stateServ.saveState(state);
    }
    
    @PutMapping("/edit/{state_id}")
    public State updateState (@RequestBody State state, @PathVariable Long state_id) {
        return stateServ.updateState(state, state_id);
    }
    
    @GetMapping("/id/{state_id}")
    public State getStateById (@PathVariable Long state_id) {
        return stateServ.findStateById(state_id);
    }
    
    @DeleteMapping ("/delete/{state_id}")
    public void deleteState (@PathVariable("state_id") Long state_id) {
        stateServ.deleteState(state_id);
    }

}
