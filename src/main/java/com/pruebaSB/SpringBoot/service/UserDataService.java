package com.pruebaSB.SpringBoot.service;

import com.pruebaSB.SpringBoot.interfaces.IUserDataService;
import com.pruebaSB.SpringBoot.model.UserData;
import com.pruebaSB.SpringBoot.repository.UserDataRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService implements IUserDataService {

    @Autowired
    public UserDataRepository dataRepo;
    
    @Override
    public List<UserData> getUsersData() {
        return dataRepo.findAll();
    }

    @Override
    public void saveUserData(UserData userData) {
        dataRepo.save(userData);
    }

    @Override
    public void deleteUserData(Long id) {
        dataRepo.deleteById(id);
    }

    @Override
    public UserData findUserDataById(Long id) {
        return dataRepo.findById(id).orElse(null);
    }

    @Override
    public UserData updateUserData(UserData userData, Long data_id) {
        Optional<UserData> localDataUser = userData.findById(data_id);
        UserData data = null;
        if (localDataUser.isPresent()) {
            data = localDataUser.get();
            data.setAbout(about);
            data.setFullName(fullName);
            data.setLastName(lastName);
            data.setName(name);
            data.setResume(resume);
            data.setUrl_img(url_img);
            data.setUserLocation(userLocation);
            data = dataRepo.save(data);
        }
        return data;
    }
    
}
