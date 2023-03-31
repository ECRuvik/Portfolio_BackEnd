package com.pruebaSB.SpringBoot.service;

import java.util.List;
import java.util.Optional;

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
        Optional<Job> localJob = jobRepo.findById(job_id);
        Job jobi = null;
        if (localJob.isPresent()) {
            jobi = localJob.get();
            jobi.setAbout(jobi.getAbout());
            jobi.setEndDate(jobi.getEndDate());
            jobi.setLogo_url(jobi.getLogo_url());
            jobi.setName(jobi.getName());
            jobi.setPosition(jobi.getPosition());
            jobi.setStartDate(jobi.getStartDate());
            jobi = jobRepo.save(job);
        }
        return job;
    }
    
}
