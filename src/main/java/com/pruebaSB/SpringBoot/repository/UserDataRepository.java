package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository <UserData, Long> {
    
}
