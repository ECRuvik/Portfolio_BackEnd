package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.Date;
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
    private Date startDate;
    private Date endDate;
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_userData_id")
    private UserData userData;

    public Study() {
    }

    public Study(Long study_id, String name, String logo_url, String institution, String title, Date startDate, Date endDate, String about) {
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
