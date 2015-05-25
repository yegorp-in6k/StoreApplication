package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class NetOfStore {
    ArrayList<Deal> dealList;

    public NetOfStore(ArrayList<Deal> dealList) {
        this.dealList = dealList;

    }
    public double sumOfDeals(Provider provider){
        double result = 0;

        for (Deal deal: dealList){
            result += deal.sumByProvider(provider);
        }
        return result;
    }
}
