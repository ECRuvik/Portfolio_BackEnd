package com.pruebaSB.SpringBoot.interfaces;

import com.pruebaSB.SpringBoot.model.State;
import java.util.List;

public interface IStateService {
    
    // Trae lista de usuarios
    public List<State> getStates ();
    
    // Añade un usuario
    public void saveState (State state);
    
    // Elimina un usuario
    public void deleteState (Long id);
    
    // Busca un usuario
    public State findStateById (Long id);
    
    // Actualiza un usuario
    public State updateState(State state, Long state_id);
    
}
