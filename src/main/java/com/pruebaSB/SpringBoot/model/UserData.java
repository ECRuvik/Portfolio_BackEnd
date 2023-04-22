package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "user_data")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long data_id;
    private String name;
    private String lastName;
    private String fullName;
    private String birthDate;
    private String position;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String about;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String resume;
    private String url_img;
    private String logo_url;
    
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    
    @OneToMany(mappedBy = "skill_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Skill> skillList;
    
    @OneToMany(mappedBy = "study_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Study> studyList;
    
    @OneToMany(mappedBy = "proyect_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Proyect> proyectList;
    
    @OneToMany(mappedBy = "job_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Job> jobList;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userData_location_id")
    private UserLocation userLocation;

    public UserData() {
    }

    public UserData(Long data_id, String name, String lastName, String fullName, String birthDate, String position, String about, String resume, String url_img, String logo_url) {
        this.data_id = data_id;
        this.name = name;
        this.lastName = lastName;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.position = position;
        this.about = about;
        this.resume = resume;
        this.url_img = url_img;
        this.logo_url = logo_url;
    }
    
}
