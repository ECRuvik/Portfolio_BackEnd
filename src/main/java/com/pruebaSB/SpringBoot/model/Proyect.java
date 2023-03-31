package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "proyects")
public class Proyect {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyect_id;
    private String name;
    private String logo_url;
    private String status;
    private Date startDate;
    private Date endDate;
    private String type;
    private String url;
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proyect_userData_id")
    private UserData userData;

    public Proyect() {
    }

    public Proyect(Long proyect_id, String name, String logo_url, String status, Date startDate, Date endDate, String type, String url, String about) {
        this.proyect_id = proyect_id;
        this.name = name;
        this.logo_url = logo_url;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.url = url;
        this.about = about;
    }
    
}
