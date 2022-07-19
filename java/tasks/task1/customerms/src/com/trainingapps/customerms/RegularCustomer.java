package com.trainingapps.customerms;

public class RegularCustomer extends Customer{
    private String offer;

    public RegularCustomer(long id, String name, int age, double balance,String offer) {
        super(id,name,age,balance);
        this.offer = offer;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
}
