package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Deal {
    ArrayList<Product> productList =new ArrayList<>();

    public Deal(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public double sumByProvider(Provider provider){
        double result = 0;
        for (Product product: productList) {
            if (product.getProvider().equals(provider)){
                result +=product.getPrice();
            }
        }
        return result;
    }

}
