package com.bootcoding.dsa.array.TwoDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Declaration
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //Initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //Add Element
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }

        //Display
        System.out.print(list);
    }
}
