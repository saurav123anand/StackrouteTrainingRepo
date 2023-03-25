package com.example.shoppingms.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table
public class ShoppingItem {
    @Id
    @Length(min = 5)
    private String id;
    @NotNull
    @Length(min = 3)
    private String name;
    @Min(1)
    private double amount;

    public ShoppingItem() {
    }

    public ShoppingItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingItem shoppingItem = (ShoppingItem) o;
        return Double.compare(shoppingItem.amount, amount) == 0 && Objects.equals(id, shoppingItem.id) && Objects.equals(name, shoppingItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
