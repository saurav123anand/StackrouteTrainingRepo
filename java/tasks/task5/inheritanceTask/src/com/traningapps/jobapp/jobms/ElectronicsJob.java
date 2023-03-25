package com.traningapps.jobapp.jobms;

public class ElectronicsJob extends Job{
    private String deviceUsed;
    private int experienceWithDeviceInYrs;

    public ElectronicsJob() {
    }

    public ElectronicsJob(String deviceUsed, int experienceWithDeviceInYrs) {
        this.deviceUsed = deviceUsed;
        this.experienceWithDeviceInYrs = experienceWithDeviceInYrs;
    }

    public ElectronicsJob(long id, String type, Company company, String deviceUsed, int experienceWithDeviceInYrs) {
        super(id, type, company);
        this.deviceUsed = deviceUsed;
        this.experienceWithDeviceInYrs = experienceWithDeviceInYrs;
    }

    public String getDeviceUsed() {
        return deviceUsed;
    }

    public void setDeviceUsed(String deviceUsed) {
        this.deviceUsed = deviceUsed;
    }

    public int getExperienceWithDeviceInYrs() {
        return experienceWithDeviceInYrs;
    }

    public void setExperienceWithDeviceInYrs(int experienceWithDeviceInYrs) {
        this.experienceWithDeviceInYrs = experienceWithDeviceInYrs;
    }
}
