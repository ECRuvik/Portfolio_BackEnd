package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String email;
    private String username;
    private String password;

    public User() {
    }

    public User(Long user_id, String email, String username, String password) {
        this.user_id = user_id;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
}
