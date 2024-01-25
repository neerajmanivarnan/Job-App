package com.neeraj.JobApp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neeraj.JobApp.services.JobService;

@Controller
public class HomeComtroller {

    @Autowired
    private JobService service;
    
    @RequestMapping({"/","home"})
    public String home(){
        return "home.jsp";
    }

    

    @GetMapping("addjob")
    public String addjob(){

        return "addjob.jsp";
    }

    @PostMapping("handleForm")
    public String handleforms(JobPost jobPost){
        service.addjob(jobPost);
        return "success.jsp";
    }

    @GetMapping("viewalljobs")
    public String viewalljobs(Model model){
        
        List<JobPost> jobPosts =  service.getJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs.jsp";
    }
}
