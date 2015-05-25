package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class StoreApplication {
    public static void main(String[] args) {
        ArrayList<Products>productsList= new ArrayList<>();

    //Products n = new Products(ProductType.BEER);
      //  System.out.println(n.counter(ProductType.PEPPER));
       /* System.out.println("Choose what to do:" +
                "1.Buy some products." +
                "2.Show sum");*/
        /*Dealings a = new Dealings(ProductType.BEER,3);
        Dealings b = new Dealings(ProductType.VODKA,2);
        Dealings rice = new Dealings(ProductType.RICE,2);
        NetOfStore aL= new NetOfStore(a);
        NetOfStore bL= new NetOfStore(b);

        //NetOfStore dL= new NetOfStore(b);
        System.out.println(bL.chooseProvider());
        System.out.println(aL.chooseProvider());
        System.out.println(aL.chooseProvider());
        System.out.println(bL.chooseProvider());
        System.out.println(bL.chooseProvider());
        System.out.println(aL.chooseProvider());*/
        Provider provider=new Provider("Ivan");
        Products products=new Products("Potato",2,provider);
        Dealings dealings= new Dealings();
    }
}
