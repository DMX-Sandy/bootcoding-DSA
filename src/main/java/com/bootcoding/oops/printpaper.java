package com.bootcoding.oops;

public class printpaper {
    int resolution;
    String colour;
    double cost;
    String size;
    String brand;

    public static void main(String[] args) {
        printpaper p1=new printpaper();
        printpaper p2=new printpaper();

        p1.size="A4";
        p1.brand="JK";
        p1.cost=0.50;
        p1.colour="White";     
    }
}

