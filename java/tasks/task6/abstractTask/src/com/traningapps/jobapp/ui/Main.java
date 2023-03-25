package com.traningapps.jobapp.ui;

import com.traningapps.jobapp.companyms.Company;
import com.traningapps.jobapp.jobms.ITJob;
import com.traningapps.jobapp.jobms.ITJobService;

public class Main {
    public static void main(String[] args) {
        // adding IT jobs
        ITJobService itJobService=new ITJobService(13);
        ITJob itJob1=new ITJob(1,"software",new Company("345g","wipro"),"java",
                2);
        ITJob itJob2=new ITJob(2,"analyst",new Company("5td7","capgemini"),"python",
                3);
        ITJob itJob3=new ITJob(3,"software",new Company("4fg8","Accenture"),"c++",
                4);
        itJobService.addJob(itJob1);
        itJobService.addJob(itJob2);
        itJobService.addJob(itJob3);

        //finding all IT Jobs
        System.out.println("finding all IT Jobs**************************");
        ITJob[] foundItJobs=itJobService.findJobByType("software");
        for(ITJob itJob:foundItJobs){
            if(itJob!=null){
                System.out.println("id is "+itJob.getId()+" language is "+itJob.getLanguage());
            }
        }

    }


}
