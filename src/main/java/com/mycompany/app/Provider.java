package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Provider {

    String name;
    //ArrayList<Double> listOfProductSum;
    public Provider(String name) {
        this.name=name;

       // listOfProductSum= new ArrayList<>();
    }

   /* public double getPriceOfDeal(){
        switch (dealings.getProductName()){
            case "Beer":
                Products beer = new Products(dealings);
                priceOfDeal +=beer.counter();
                break;
            case "Vodka":
                Products vodka = new Products(dealings);
                priceOfDeal += vodka.counter();
                break;
            case "Rice":
                Products rice = new Products(dealings);
                priceOfDeal += rice.counter();
                break;
            case "Buckwheat":
                Products buckwheat = new Products(dealings);
                priceOfDeal += buckwheat.counter();
                break;
            case "Tomato":
                Products tomato = new Products(dealings);
                priceOfDeal += tomato.counter();
                break;
            case "Corn":
                Products corn = new Products(dealings);
                priceOfDeal += corn.counter();
                break;
            case "Lettuce":
                Products lettuce = new Products(dealings);
                priceOfDeal += lettuce.counter();
                break;
            case "Pepper":
                Products pepper = new Products(dealings);
                priceOfDeal += pepper.counter();
                break;
        }
        return priceOfDeal;
    }*/
}
