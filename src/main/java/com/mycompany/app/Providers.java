package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Providers {
    String name;
    Products products;
    Dealings dealings;
    ArrayList<Double> listOfProductSum;
    public Providers(String name, Dealings dealings) {
        this.name = name;
        this.dealings = dealings;
        listOfProductSum= new ArrayList<>();
    }

    public void choseProdacts(){
        double result;
        switch (dealings.getProductName()){
            case "Beer":
                Products beer = new Products(dealings);
                =beer.counter();
        }
    }
}
