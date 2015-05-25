package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created by Егор on 24.05.2015.
 */
public class NetOfStore {
    ArrayList<Dealings> dealList;

    public NetOfStore(ArrayList<Dealings> dealList) {
        this.dealList = dealList;
    }

    /*Dealings dealings;
    ArrayList<Double> listOfLiquor = new ArrayList<>();
    ArrayList<Double> listOfGroats = new ArrayList<>();
    ArrayList<Double> listOfVegetables = new ArrayList<>();

    public NetOfStore(Dealings dealings) {
        this.dealings = dealings;
        chooseProvider();
    }

    public String getDealingsProductNameType() {
        return dealings.getProductNameType();
    }
    public double chooseProvider(){
        double result=0;
        switch (dealings.getProductNameType()){
            case "liquor":
                Provider providerOfLiquor = new Provider(dealings);
                    listOfLiquor.add(providerOfLiquor.getPriceOfDeal());
                    result = calculetedSum(listOfLiquor);
                break;
            case "groats":
                    Provider providerOfGroats = new Provider(dealings);
                    listOfGroats.add(providerOfGroats.getPriceOfDeal());
                    result = calculetedSum(listOfGroats);
                break;
            case "Vegetables":
                    Provider providerOfVegetables = new Provider(dealings);
                    listOfVegetables.add(providerOfVegetables.getPriceOfDeal());
                    result = calculetedSum(listOfVegetables);
                break;
        }
        return result;
    }
    public double calculetedSum(ArrayList<Double> arrayList) {
        double result = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    result += arrayList.get(i);
                }

        return result;
    }*/
}
