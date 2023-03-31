package com.pruebaSB.SpringBoot.service;

import com.pruebaSB.SpringBoot.interfaces.IUserService;
import com.pruebaSB.SpringBoot.model.User;
import com.pruebaSB.SpringBoot.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public void saveUser (User user) {
            userRepo.save(user);
    }
    
    @Override
    public List<User> getUsers () {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser (Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findUserById (Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
    @Override
    public User updateUser (User user, Long user_id) {
        Optional<User> localUser = userRepo.findById(user_id);
        User usr = null;
        if (localUser.isPresent()) {
            usr = localUser.get();
            usr.setEmail(user.getEmail());
            usr.setUsername(user.getUsername());
            usr.setPassword(user.getPassword());
            usr = userRepo.save(usr);
        }
        return usr;
    }
    
}
