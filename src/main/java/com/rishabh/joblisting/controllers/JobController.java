package com.rishabh.joblisting.controllers;

import com.rishabh.joblisting.models.Job;
import com.rishabh.joblisting.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobRepository jobRepository;

    @GetMapping("/alljobs")
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    @PostMapping("/postjob")
    public Job postJob(@RequestBody Job job){
        return jobRepository.save(job);
    }
}
