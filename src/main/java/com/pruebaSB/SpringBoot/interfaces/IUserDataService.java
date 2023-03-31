package com.pruebaSB.SpringBoot.interfaces;

import com.pruebaSB.SpringBoot.model.UserData;
import java.util.List;

public interface IUserDataService {
    
    // Trae lista de usuarios
    public List<UserData> getUsersData ();
    
    // Añade un usuario
    public void saveUserData (UserData userData);
    
    // Elimina un usuario
    public void deleteUserData (Long id);
    
    // Busca un usuario
    public UserData findUserDataById (Long id);
    
    // Actualiza un usuario
    public UserData updateUserData(UserData userData, Long data_id);
    
}
