package com.pruebaSB.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebaSB.SpringBoot.interfaces.IUserLocationService;
import com.pruebaSB.SpringBoot.model.UserLocation;
import com.pruebaSB.SpringBoot.repository.UserLocationRepository;
import org.springframework.stereotype.Service;

@Service
public class UserLocationService implements IUserLocationService {

    @Autowired
    public UserLocationRepository locationRepo;

    @Override
    public List<UserLocation> getLocations() {
        return locationRepo.findAll();
    }

    @Override
    public void saveLocation(UserLocation location) {
        locationRepo.save(location);
    }

    @Override
    public void deleteLocation(Long id) {
        locationRepo.deleteById(id);
    }

    @Override
    public UserLocation findLocationById(Long id) {
        return locationRepo.findById(id).orElse(null);
    }

    @Override
    public UserLocation updateLocation(UserLocation location, Long location_id) {
        Optional<UserLocation> localLocation = locationRepo.findById(location_id);
        UserLocation locationi = null;
        if (localLocation.isPresent()) {
            locationi = localLocation.get();
            locationi.setAddress(location.getAddress());
            locationi.setCity(location.getCity());
            locationi.setPostal_code(location.getPostal_code());
            locationi = locationRepo.save(locationi);
        }
        return locationi;
    }

}
