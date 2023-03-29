package com.pruebaSB.SpringBoot.service;

import com.pruebaSB.SpringBoot.model.User;
import java.util.List;

public interface IUserService {
    
    // Trae lista de usuarios
    public List<User> getUsers ();
    
    // Añade un usuario
    public User saveUser (User user) throws Exception;
    
    // Elimina un usuario
    public void deleteUser (Long id);
    
    // Busca un usuario
    public User findUser (Long id);
    
    // Busca un usuario por su nombre de usuario
    public User findUserByUsername (String username);
    
    // Busca un usuario por su email
    public User findUserByEmail (String email);
}
