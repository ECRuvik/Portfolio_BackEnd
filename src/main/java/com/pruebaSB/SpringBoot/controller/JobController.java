package com.pruebaSB.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pruebaSB.SpringBoot.interfaces.IJobService;
import com.pruebaSB.SpringBoot.model.Job;

@RestController
@RequestMapping("/jobs")
public class JobController {
    
    @Autowired
    private IJobService jobServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<Job> seeJobs () {
        return jobServ.getJobs();
    }
    
    @PostMapping ("/add")
    public void addJob (@RequestBody Job job) {
        jobServ.saveJob(job);
    }
    
    @PutMapping("/edit/{job_id}")
    public Job updateJob (@RequestBody Job job, @PathVariable Long job_id) {
        return jobServ.updateJob(job, job_id);
    }
    
    @GetMapping("/id/{job_id}")
    public Job getJobById (@PathVariable Long job_id) {
        return jobServ.findJobById(job_id);
    }
    
    @DeleteMapping ("/delete/{job_id}")
    public void deleteJob (@PathVariable("job_id") Long job_id) {
        jobServ.deleteJob(job_id);
    }
    
}
