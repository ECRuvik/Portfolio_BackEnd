package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "states")
public class State {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long state_id;
    private String name;
    
    @OneToMany(mappedBy = "location_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<UserLocation> userLocationList;

    public State() {
    }

    public State(Long state_id, String name) {
        this.state_id = state_id;
        this.name = name;
    }
    
}
