package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public enum ProductType {
    BEER("Beer",5,"liquor"),
    VODKA("Vodka",12,"liquor"),
    RUM("Run",24,"liquor"),
    RICE("Rice",3,"groats"),
    BUCKWHEAT("Buckwheat", 4,"groats"),
    TOMATO("Tomato",3,"Vegetables"),
    CORN("Corn",4,"Vegetables"),
    LETTUCE("Lettuce",3,"Vegetables"),
    PEPPER("Pepper",6,"Vegetables");
    String nameOfProduct;
    double price;
    String nameOfType;

    ProductType(String nameOfProduct, double price, String nameOfType){
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.nameOfType = nameOfType;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getNameOfType() {
        return nameOfType;
    }

    public double getPrice() {
        return price;


    }
}
