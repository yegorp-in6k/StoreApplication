package com.mycompany.app;

/**
 * Created by Егор on 24.05.2015.
 */
public class Dealings {
    ProductType productType;
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
    public double getProductPrice(){return productType.getPrice();}
}
