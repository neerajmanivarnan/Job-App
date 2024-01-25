package com.neeraj.JobApp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.neeraj.JobApp.model.JobPost;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();
    public JobRepo(){
        //java developer
        jobs.add( new JobPost(1,"Java developer","Experienced java developer required",5));
        jobs.add( new JobPost(2,"React developer","Experienced react developer required",5));
        jobs.add( new JobPost(3,"Angular developer","Experienced java developer required",5));
        jobs.add( new JobPost(4,"Node js developer","Experienced java developer required",5));
        jobs.add( new JobPost(5,"MERN Stack developer","Experienced java developer required",5));
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void saveJob(JobPost job){
        jobs.add(job);
    }

}
