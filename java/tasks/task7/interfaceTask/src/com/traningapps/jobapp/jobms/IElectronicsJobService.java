package com.traningapps.jobapp.jobms;

public interface IElectronicsJobService {
    ElectronicsJob addJob(ElectronicsJob electronicsJob);
    ElectronicsJob findJobById(long id);
    ElectronicsJob[]findAll();
}
