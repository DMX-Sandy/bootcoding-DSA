//Write a program to find the number of elements in an array that are greater than the average.
package com.bootcoding.dsa.array.OneDArray;

public class findTheElemntGreaterthanAvg {
    public static void main(String[] args) {
        int [] arr={30,20,10,50,40,90,60,10,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        int count=0;

        for(int i=0;i< arr.length;i++){
            if (arr[i]>avg) {
                count++;

            }
        }
        System.out.println(count);
    }
}
