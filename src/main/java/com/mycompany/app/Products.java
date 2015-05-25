package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Products {
    String name;
    double price;
    Provider provider;

    public Products(String name, double price, Provider provider) {
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
    /*  String name;
    double price;
    Provider provider;
    public Products(Dealings dealings) {
        this.dealings = dealings;
    }

    public Products(String potato, int i, Provider provider) {
        this.name
    }

    public double counter(){
        return dealings.getAmount()*dealings.getProductPrice();
    }*/
}
