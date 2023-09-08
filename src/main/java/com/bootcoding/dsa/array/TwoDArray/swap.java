package com.bootcoding.dsa.array.TwoDArray;

public class swap {
    public static void main(String[] args) {
        int arr[] []={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        swap(arr,0,2);
        System.out.println(arr);
    }
    public static void  swap(int arr[][],int index1,int index2){
        int temp=arr[index1][index1];
        arr[index1][index1]=arr[index2][index2];
        arr[index2][index2]=temp;
    }
}
