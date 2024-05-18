package com.bootcoding.TCS_NQT;

public class Cube_Range {
    public static void main(String[] args) {
        double n = 2;
        double m = 5;
        int k = 3;
        System.out.println(Sumcube(n,m,k));
    }
    public static double Sumcube(double n, double m ,int k ){
        int sum =0;

        for(double i =n;i<=m;i++){
            sum += Math.pow(i,k);
        }
        return sum ;
    }
}
