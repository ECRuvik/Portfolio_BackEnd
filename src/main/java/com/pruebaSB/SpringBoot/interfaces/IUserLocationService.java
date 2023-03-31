package com.pruebaSB.SpringBoot.interfaces;

import com.pruebaSB.SpringBoot.model.UserLocation;
import java.util.List;

public interface IUserLocationService {
    
    // Trae lista de usuarios
    public List<UserLocation> getLocation ();
    
    // Añade un usuario
    public void saveLocation (UserLocation location);
    
    // Elimina un usuario
    public void deleteLocation (Long id);
    
    // Busca un usuario
    public UserLocation findLocationById (Long id);
    
    // Actualiza un usuario
    public UserLocation updateLocation(UserLocation location, Long location_id);
    
}
