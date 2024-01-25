package com.neeraj.JobApp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.JobApp.model.JobPost;
import com.neeraj.JobApp.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addjob(JobPost job){
        repo.saveJob(job); 
    }

    public List<JobPost> getJobs(){
        return repo.getAllJobs();
    }
}
