package com.pruebaSB.SpringBoot.model;

import jakarta.persistence.*;
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
    private String startDate;
    private String endDate;
    private String position;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_userData_id")
    private UserData userData;

    public Job() {
    }

    public Job(Long job_id, String name, String logo_url, String startDate, String endDate, String position, String about) {
        this.job_id = job_id;
        this.name = name;
        this.logo_url = logo_url;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.about = about;
    }
    
}
