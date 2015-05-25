package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class Products {
    Dealings dealings;
    ProductType productType;

    public Products(Dealings dealings) {
        this.dealings = dealings;
    }

    public double counter(){
        return dealings.getAmount()*dealings.getProductPrice();
    }
}
