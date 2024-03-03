package com.bootcoding.dsa.PatternQ;
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 *
 * *
 * * *
 * * * *
 * * * * *
 */

import java.util.Scanner;
public class K_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n+1;i<=2*n;i++){
            for(int j=n+1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
