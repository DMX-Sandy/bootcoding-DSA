package com.bootcoding.dsa.array.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class INput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                /*we're calling arr[row].length because every
                row itself an array so every array element is col itself*/
                arr[row][col]=sc.nextInt();
            }
        }

//        //Traditional Loop
//        for(int row=0;row< arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        //ToString Method
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //for Each Loop
        for(int a[]:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
