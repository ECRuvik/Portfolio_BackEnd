package com.pruebaSB.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebaSB.SpringBoot.interfaces.IJobService;
import com.pruebaSB.SpringBoot.model.Job;
import com.pruebaSB.SpringBoot.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobService implements IJobService {
    
    @Autowired
    public JobRepository jobRepo;
    
    @Override
    public List<Job> getJobs() {
        return jobRepo.findAll();
    }

    @Override
    public void saveJob(Job job) {
        jobRepo.save(job);
    }

    @Override
    public void deleteJob(Long id) {
        jobRepo.deleteById(id);
    }

    @Override
    public Job findJobById(Long id) {
        return jobRepo.findById(id).orElse(null);
    }

    @Override
    public Job updateJob(Job job, Long job_id) {
        Optional<Job> localState = job.findById(job_id);
        Job jobi = null;
        if (localJob.isPresent()) {
            jobi = localJob.get();
            jobi.setAbout(about);
            jobi.setEndDate(endDate);
            jobi.setLogo_url(logo_url);
            jobi.setName(name);
            jobi.setPosition(position);
            jobi.setStartDate(startDate);
            jobi = jobRepo.save(job);
        }
        return job;
    }
    
}
