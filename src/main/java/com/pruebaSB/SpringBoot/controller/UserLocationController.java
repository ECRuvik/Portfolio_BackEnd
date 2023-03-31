package com.pruebaSB.SpringBoot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pruebaSB.SpringBoot.interfaces.IUserLocationService;
import com.pruebaSB.SpringBoot.model.UserLocation;

@RestController
@RequestMapping("/locations")
public class UserLocationController {
    
    @Autowired
    private IUserLocationService locationServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<UserLocation> seeLocations () {
        return locationServ.getLocations();
    }
    
    @PostMapping ("/add")
    public void addLocation (@RequestBody UserLocation location) {
        locationServ.saveLocation(location);
    }
    
    @PutMapping("/edit/{location_id}")
    public UserLocation updateLocation (@RequestBody UserLocation location, @PathVariable Long location_id) {
        return locationServ.updateLocation(location, location_id);
    }
    
    @GetMapping("/id/{location_id}")
    public UserLocation getLocationById (@PathVariable Long location_id) {
        return locationServ.findLocationById(location_id);
    }
    
    @DeleteMapping ("/delete/{location_id}")
    public void deleteLocation (@PathVariable("location_id") Long location_id) {
        locationServ.deleteLocation(location_id);
    }
    
}
