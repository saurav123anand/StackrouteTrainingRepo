package com.trainingapps.productms.entity;


import lombok.Data;

//Automatic Resource Management, automatic generation of
// getters, setters, equals, hashCode and toString, and more!
@Data
public class Product {
    private long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


}
