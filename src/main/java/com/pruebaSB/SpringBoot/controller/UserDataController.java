package com.pruebaSB.SpringBoot.controller;

import com.pruebaSB.SpringBoot.interfaces.IUserDataService;
import com.pruebaSB.SpringBoot.model.UserData;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class UserDataController {
    
    @Autowired
    private IUserDataService dataServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<UserData> seeUsersDataUserData () {
        return dataServ.getUsersData();
    }
    
    @PostMapping ("/add")
    public void addUserData (@RequestBody UserData data) {
        dataServ.saveUserData(data);
    }
    
    @PutMapping("/edit/{data_id}")
    public UserData updateUserData (@RequestBody UserData data, @PathVariable Long data_id) {
        return dataServ.updateUserData(data, data_id);
    }
    
    @GetMapping("/id/{data_id}")
    public UserData getUserDataById (@PathVariable Long data_id) {
        return dataServ.findUserDataById(data_id);
    }
    
    @DeleteMapping ("/delete/{data_id}")
    public void deleteUserData (@PathVariable("data_id") Long data_id) {
        dataServ.deleteUserData(data_id);
    }
    
}
