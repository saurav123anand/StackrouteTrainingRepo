package com.trainingapps.customerms;

public class BusinessCustomer extends Customer{
    private double discount;

    public BusinessCustomer(long id, String name, int age, double balance,double discount) {
        super(id,name,age,balance);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
