package com.neeraj.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class JobPost {
    int postId;
    String postProfile;
    String postDesc;
    int reqExperience;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }
    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }
    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }
    
    public int getReqExperience() {
        return reqExperience;
    }
    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    @Override
    public String toString() {
        return "JobPost [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc
                + ", reqExperience=" + reqExperience + "]";
    }
   
    

    
    
}
