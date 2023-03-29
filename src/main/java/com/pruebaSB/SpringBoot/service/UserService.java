package com.pruebaSB.SpringBoot.service;

import com.pruebaSB.SpringBoot.interfaces.IUserService;
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
    public void saveUser(User user) {
            userRepo.save(user);
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
    
}
