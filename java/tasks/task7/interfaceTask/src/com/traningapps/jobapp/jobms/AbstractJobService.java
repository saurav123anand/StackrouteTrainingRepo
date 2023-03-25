package com.traningapps.jobapp.jobms;

public abstract class AbstractJobService {
    Job[] jobs;
    public AbstractJobService(int capacity){
        jobs=new Job[capacity];
    }
    private int index=0;
    public Job addJob(Job job){
        if(index<jobs.length){
            jobs[index]=job;
            index++;
            return job;
        }
        return null;
    }
    public Job findJobById(long id){
        for(Job job:jobs){
            if(job!=null && job.getId()==id){
                return job;
            }
        }
        return null;
    }
    public Job[] findAll(){
        return jobs;
    }
}
