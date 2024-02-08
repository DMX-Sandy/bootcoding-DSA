package com.bootcoding.dsa.bitwise;

public class ArrayUnique {
    public static void main(String[] args) {
        int []a={2,3,4,1,2,1,3,6,4};
        System.out.println(uni(a));
    }

    private static int uni(int[] a) {
        int unique=0;
        for(int i:a){
            unique ^=i;

        }
        return unique;
    }
}
