package com.mycompany.app;

/**
 * Created by Егор on 24.05.2015.
 */
public class NetOfStore {
    Dealings dealings;
    double[] arrOfLiquor= new double[10];

    public NetOfStore(Dealings dealings) {
        this.dealings = dealings;
    }

    public String getDealingsProductNameType() {
        return dealings.getProductNameType();
    }
    public void chooseProvider(){
        switch (dealings.getProductNameType()){
            case "liquor":

                Providers providersOfLiquor = new Providers("liquor",dealings);
                       providersOfLiquor.
        }
    }
}
