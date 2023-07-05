package com.bootcoding.oops;

public class watch {
    double cost;

    String material;
    String brand;
    String shape;
    //class does't hold memory.


    public static void main(String[] args) {
        watch w1=new watch();
        watch w2=new watch();


        w1.material="steel";
        w1.brand="Slupture";
        w1.cost=6000.00;
        w1.shape="Round";

        w2.cost=36000.00;
        w2.material="silver";
        w2.brand="Rolex";
        w2.shape="Square";

        System.out.println(w1.material);
        System.out.println(w2.material);
    }
}

