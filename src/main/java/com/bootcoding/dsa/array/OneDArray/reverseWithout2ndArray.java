//Reverse Array without using second array
package com.bootcoding.dsa.array.OneDArray;

public class reverseWithout2ndArray {
    public static void main(String[] args) {
       int [] arr={10,20,30,40,50};
       int temp=0;
       for(int i=0;i<arr.length/2;i++){
           temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;

        }
       for(int j=0;j<arr.length;j++){
           System.out.print(arr[j]+" ");

        }
    }

}
