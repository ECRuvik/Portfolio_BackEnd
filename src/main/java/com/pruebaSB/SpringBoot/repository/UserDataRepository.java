package com.pruebaSB.SpringBoot.repository;

import com.pruebaSB.SpringBoot.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository <UserData, Long> {
    
}
