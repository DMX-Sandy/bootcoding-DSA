package com.bootcoding.dsa.Arrrays.operations.sorting;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={8,5,7,2,9,8};

        for(int i=0;i<arr.length;i++){
        int key =arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
