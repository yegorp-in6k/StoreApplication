package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Product {
    String name;
    double price;
    Provider provider;

    public Product(String name, double price, Provider provider) {
        this.name = name;
        this.price = price;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Provider getProvider() {
        return provider;
    }

}
