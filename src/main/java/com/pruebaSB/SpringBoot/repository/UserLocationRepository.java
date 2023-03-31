package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationRepository extends JpaRepository <UserLocation, Long> {
    
}
