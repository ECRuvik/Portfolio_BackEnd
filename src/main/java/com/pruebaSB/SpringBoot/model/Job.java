package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "jobs")
public class Job {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_id;
    private String name;
    private String logo_url;
    private Date startDate;
    private Date endDate;
    private String position;
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_userData_id")
    private UserData userData;

    public Job() {
    }

    public Job(Long job_id, String name, String logo_url, Date startDate, Date endDate, String position, String about) {
        this.job_id = job_id;
        this.name = name;
        this.logo_url = logo_url;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.about = about;
    }
    
}
