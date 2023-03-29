package com.pruebaSB.SpringBoot.controller;

import com.pruebaSB.SpringBoot.interfaces.IUserService;
import com.pruebaSB.SpringBoot.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    
    @DeleteMapping ("/delete/{user_id}")
    public void deleteUser (@PathVariable("user_id") Long user_id) {
        userServ.deleteUser(user_id);
    }
    
}
