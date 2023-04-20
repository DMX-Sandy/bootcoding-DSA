//Two elements whose sum is closest to zero
package com.bootcoding.dsa.ArrayGFG;

public class NearestTo0 {
    public static void main(String[] args) {
        int arr[]= {-21,-67,-37,-18,4,-65};

        int in=0;
        int sum=0;
        int minl,minr,min_sum=0;

        if (arr.length<2){
            System.out.println("Invalid input");
        }

        minl=0;
        minr=1;
        min_sum=arr[0]+arr[1];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(Math.abs(min_sum)>Math.abs(sum)){
                    min_sum=sum;
                    minl=i;
                    minr=j;

                }
            }
        }
        System.out.println("The addition of two number "+arr[minl]+" & "+arr[minr]+" is near to zero.");
    }
}
