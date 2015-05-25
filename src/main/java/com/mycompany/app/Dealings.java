package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Dealings {
    ArrayList<Products> productsList =new ArrayList<>();
    double amount;
    Products products;

    public Dealings(ArrayList<Products> productsList, double amount, Products products) {
        this.productsList = productsList;
        this.amount = amount;
        this.products = products;
    }
    public double counterOneProvider(){
        double result = 0;
        for (Products product: productsList) {
            if (product.getProvider()==){
                result =  amount*product.getPrice();
            }
        }
        return result;
    }
    /* ProductType productType;
    double amount;

    Dealings(ProductType productType, double amount ) {
        this.productType = productType;
        this.amount = amount;
    }

    public ProductType getProductType() {
        return productType;
    }
    public String getProductName(){
        return productType.getNameOfProduct();
    }
    public String getProductNameType(){
        return productType.getNameOfType();
    }
    public double getAmount() {
        return amount;
    }
    public double getProductPrice(){return productType.getPrice();}*/
}
