package com.pruebaSB.SpringBoot.controller;

import com.pruebaSB.SpringBoot.interfaces.IUserService;
import com.pruebaSB.SpringBoot.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUserService userServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<User> seeUsers () {
        return userServ.getUsers();
    }
    
    @PostMapping ("/add")
    public void addUser (@RequestBody User user) {
        userServ.saveUser(user);
    }
    
    @PutMapping("/edit/{user_id}")
    public User updateUser (@RequestBody User user, @PathVariable Long user_id) {
        return userServ.updateUser(user, user_id);
    }
    
    @GetMapping("/id/{user_id}")
    public User getUserById (@PathVariable Long user_id) {
        return userServ.findUserById(user_id);
    }
    
    @DeleteMapping ("/delete/{user_id}")
    public void deleteUser (@PathVariable("user_id") Long user_id) {
        userServ.deleteUser(user_id);
    }
    
}
