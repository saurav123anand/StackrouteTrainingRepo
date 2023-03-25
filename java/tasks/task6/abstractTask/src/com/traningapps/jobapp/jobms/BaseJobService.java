package com.traningapps.jobapp.jobms;

import com.traningapps.jobapp.companyms.Company;

public abstract class BaseJobService {
    Job jobs[];
    public BaseJobService(int capacity){
        jobs=new Job[capacity];
    }
    private int index=0;

    public void addJob(Job job){
        if(index< jobs.length){
            jobs[index]=job;
            index++;
        }
    }

    //finding jobs by id
    public Job findJobById(long id){
        for(Job job:jobs){
            if(job!=null && job.getId()==id){
                return job;
            }
        }
        return null;
    }

    //finding jobs by type
    public Job[] findJobsByType(String type){
        Job foundJobs[]=new Job[23];
        int index=0;
        for(Job job:jobs){
            if(job!=null && job.getType().equalsIgnoreCase(type)){
                foundJobs[index]=job;
                index++;
            }
        }
        return foundJobs;
    }
    //getting all the jobs
    public Job[] findAll(){
        return jobs;
    }
}
