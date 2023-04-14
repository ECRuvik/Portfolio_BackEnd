package com.pruebaSB.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebaSB.SpringBoot.interfaces.IStateService;
import com.pruebaSB.SpringBoot.model.State;
import com.pruebaSB.SpringBoot.repository.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService implements IStateService {

    @Autowired
    public StateRepository stateRepo;

    @Override
    public List<State> getStates() {
        return stateRepo.findAll();
    }

    @Override
    public void saveState(State state) {
        stateRepo.save(state);
    }

    @Override
    public void deleteState(Long id) {
        stateRepo.deleteById(id);
    }

    @Override
    public State findStateById(Long id) {
        return stateRepo.findById(id).orElse(null);
    }

    @Override
    public State updateState(State state, Long state_id) {
        Optional<State> localState = stateRepo.findById(state_id);
        State statei = null;
        if (localState.isPresent()) {
            statei = localState.get();
            statei.setName(state.getName());
            statei = stateRepo.save(statei);
        }
        return statei;
    }

}
