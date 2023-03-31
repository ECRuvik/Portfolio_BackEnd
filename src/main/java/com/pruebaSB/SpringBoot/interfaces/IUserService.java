package com.pruebaSB.SpringBoot.interfaces;



import com.pruebaSB.SpringBoot.model.User;
import java.util.List;

public interface IUserService {
    
    // Trae lista de usuarios
    public List<User> getUsers ();
    
    // Añade un usuario
    public void saveUser (User user);
    
    // Elimina un usuario
    public void deleteUser (Long id);
    
    // Busca un usuario
    public User findUserById (Long id);
    
    // Actualiza un usuario
    public User updateUser(User user, Long user_id);
    
}
