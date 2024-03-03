package com.bootcoding.dsa.PatternQ;

import java.util.Scanner;

public class L_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
