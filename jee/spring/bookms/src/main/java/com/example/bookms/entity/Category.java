package com.example.bookms.entity;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "jpa_category")
public class Category {
    @Id
    private int categoryId;
    private String tittle;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Product> products=new ArrayList<>();

    public Category() {
    }

    public Category(int categoryId, String tittle, List<Product> products) {
        this.categoryId = categoryId;
        this.tittle = tittle;
        this.products = products;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
