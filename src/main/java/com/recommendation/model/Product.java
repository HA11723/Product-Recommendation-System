package com.recommendation.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    //This is primary key of the Product table in the database
    @Id
    private Long id;
    //the name of the product
    private String name;
    //the description of the product
    private String description;
    //the price of the product
    private double price;
    //default constructor
    public Product() {}

    public Product(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
