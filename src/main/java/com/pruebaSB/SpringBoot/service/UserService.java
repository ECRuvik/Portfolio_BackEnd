package com.pruebaSB.SpringBoot.service;

import com.pruebaSB.SpringBoot.model.User;
import com.pruebaSB.SpringBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public User saveUser(User user) throws Exception {
        User userUsername = userRepo.findByUsername(user.getUsername());
        User userEmail = userRepo.findByEmail(user.getEmail());
        if(userUsername != null) {
            System.out.println("El nombre de usuario ya está en uso");
            throw new Exception("El nombre de usuario ya se encuentra registrado.");
        } else if(userEmail != null)  {
            System.out.println("Este correo ya está en uso");
            throw new Exception("Este correo electrónico ya se encuentra registrado.");
        } else {
            userRepo.save(user);
        }
        return user;
    }
    
    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
    @Override
    public User findUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    
    @Override
    public User findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    
}
