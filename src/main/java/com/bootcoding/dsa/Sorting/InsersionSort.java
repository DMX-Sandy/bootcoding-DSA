package com.bootcoding.dsa.Sorting;

public class InsersionSort {
    public static void main(String[] args) {
        int arr[] = {12, 45, 23, 51, 19, 8};
        insersion(arr);
    }

    public static void insersion(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int current = arr[i];
            int j= i-1;
            while(arr[j] >current && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}
