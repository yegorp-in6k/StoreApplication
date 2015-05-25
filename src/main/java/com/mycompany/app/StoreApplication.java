package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class StoreApplication {
    public static void main(String[] args) {
        Provider providerIvan = new Provider("Ivan");
        Provider providerVasya = new Provider("Vasya");
        Product banan = new Product("Banan", 7, providerVasya);
        Product apple = new Product("Apple", 6, providerIvan );

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(apple);
        productList.add(banan);
        productList.add(banan);

        Deal deal=new Deal(productList);
        ArrayList<Deal> deals =new ArrayList<>();
        deals.add(deal);
        NetOfStore netOfStore = new NetOfStore(deals);
        System.out.println(netOfStore.sumOfDeals(providerIvan));
        System.out.println(netOfStore.sumOfDeals(providerVasya));
    }
}
