package com.bootcoding.dsa.Arrrays.operations.general;

public class InsertAtFirst {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9};
        int element=5;

        int dummy[]=new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            dummy[i+1]=arr[i];
        }
        dummy[0]=element;

        for(int i=0;i< dummy.length;i++){
            System.out.print(dummy[i]+" ");
        }
    }
}
