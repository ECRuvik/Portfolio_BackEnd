package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "user_location")
public class UserLocation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long location_id;
    private String city;
    private String address;
    private String postal_code;
    
    @OneToMany(mappedBy = "data_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<UserData> userDataList;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_state_id")
    private State userState;

    public UserLocation() {
    }

    public UserLocation(Long location_id, String city, String address, String postal_code) {
        this.location_id = location_id;
        this.city = city;
        this.address = address;
        this.postal_code = postal_code;
    }
    
}
