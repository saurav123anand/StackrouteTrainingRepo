package com.traningapps.jobapp.jobms;

public class ITJobServiceImpl extends AbstractJobService implements IITJobService{
    public ITJobServiceImpl(int capacity) {
        super(capacity);
    }

    @Override
    public ITJob addJob(ITJob itJob) {
       Job job=super.addJob(itJob);
       return (ITJob)job;
    }
    public ITJob findJobById(long id){
        Job job=super.findJobById(id);
        return (ITJob)job;
    }
    public ITJob[] findAll(){
        ITJob[] foundJobs=new ITJob[5];
        int index=0;
        Job[] jobs=super.findAll();
        for(Job job:jobs){
            if(index<foundJobs.length && job!=null){
                foundJobs[index]=(ITJob)job;
                index++;
            }
        }
        return foundJobs;
    }


}
