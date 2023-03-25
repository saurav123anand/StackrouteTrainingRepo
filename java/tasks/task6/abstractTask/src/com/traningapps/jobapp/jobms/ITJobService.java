package com.traningapps.jobapp.jobms;

public class ITJobService extends BaseJobService{
    public ITJobService(int capacity) {
        super(capacity);
    }
    @Override
    public void addJob(Job job) {
        super.addJob(job);
    }
    public ITJob findJobById(long id){
        Job job=super.findJobById(id);
        return (ITJob)job;
    }
    public ITJob[] findJobByType(String type){
        /*Job[] jobs=super.findJobsByType(type);
        return (ITJob[])jobs;*/
        ITJob[] itJobs=new ITJob[12];
        int index=0;
        for(Job job:super.findJobsByType(type)){
            if(index<itJobs.length && job!=null){
                itJobs[index]=(ITJob) job;
                index++;
            }
        }
        return itJobs;
    }
    public ITJob[] findAll(){
        return (ITJob[])super.findAll();
    }
}
