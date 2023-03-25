package com.traningapps.jobapp.jobms;

public class ElectronsJobService extends BaseJobService{

    public ElectronsJobService(int capacity) {
        super(capacity);
    }
    public void addJob(Job job) {
        super.addJob(job);
    }
    public ITJob findJobById(long id){
        Job job=super.findJobById(id);
        return (ITJob)job;
    }
    public ITJob[] findJobByType(String type){
        Job[] jobs=super.findJobsByType(type);
        return (ITJob[])jobs;
    }
    public ITJob[] findAll(){
        return (ITJob[])super.findAll();
    }
}
