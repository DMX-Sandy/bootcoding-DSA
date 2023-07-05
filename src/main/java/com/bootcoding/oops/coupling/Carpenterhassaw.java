package com.bootcoding.oops.coupling;

public class Carpenterhassaw {
    public static void main(String[] args) {
        saw Saw=new saw();
        Saw.name="Hacksaw";
        Saw.material="Steel";
        Saw.type="Small teeth";
        Saw.shape="Round";
        Saw.price=700.00;

        carpenter Carpenter=new carpenter();
        Carpenter.name="Sachin";
        Carpenter.contact=9325233098l;
        Carpenter.minimumchagre=500;
        Carpenter.Saw=Saw;


        System.out.println("Carpenter Name : "+Carpenter.name);
        System.out.println("Carpenter Contact : "+Carpenter.contact);
        System.out.println("Carpenter Minimum charges: "+Carpenter.minimumchagre);
        System.out.println("Saw Name : "+Carpenter.Saw.name);
        System.out.println("Saw Material : "+Carpenter.Saw.material);
        System.out.println("Saw Type : "+Carpenter.Saw.type);
        System.out.println("Saw Shape : "+Carpenter.Saw.shape);
        System.out.println("Saw ");
    }


}
