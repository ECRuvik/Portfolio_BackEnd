package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "studies")
public class Study {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long study_id;
    private String name;
    private String logo_url;
    private String institution;
    private String title;
    private String startDate;
    private String endDate;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_userData_id")
    private UserData userData;

    public Study() {
    }

    public Study(Long study_id, String name, String logo_url, String institution, String title, String startDate, String endDate, String about) {
        this.study_id = study_id;
        this.name = name;
        this.logo_url = logo_url;
        this.institution = institution;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.about = about;
    }
    
}
