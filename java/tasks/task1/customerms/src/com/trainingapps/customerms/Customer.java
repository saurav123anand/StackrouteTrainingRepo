package com.trainingapps.customerms;

public class Customer {
    private long id;
    private String name;
    private int age;
    private double balance;

    public Customer() {
    }

    public Customer(long id, String name, int age, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
