package com.bootcoding.dsa.PatternQ;

import java.util.Scanner;

public class Another_Pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int k =1;
            for(int j =1;j<=i;j++){
//                System.out.print(k+" ");
//                k++;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
