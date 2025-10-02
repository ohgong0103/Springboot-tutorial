package com.tutorial.apidemo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) // tu dong tang di
    private Long id;
    private String productName;
    private int productYear;
    
    private double price;
    private String url;

    public Product() {
    }

    public Product(String productName, int productYear, double price, String url) {

        this.productName = productName;
        this.productYear = productYear;
        this.price = price;
        this.url = url;


    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getProductName() {return this.productName;}
    public void setProductName(String productName) {this.productName = productName;}
    public int getproductYear() {return this.productYear;}
    public void setproductYear(int productYear) {this.productYear = productYear;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}
    public String getUrl() {return this.url;}
    public void setUrl(String url) {this.url = url;}

}
