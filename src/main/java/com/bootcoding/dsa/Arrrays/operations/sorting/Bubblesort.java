package com.bootcoding.dsa.Arrrays.operations.sorting;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={6,7,4,5,3,9,2};

        int n= arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
