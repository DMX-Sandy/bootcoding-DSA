package com.bootcoding.dsa.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={12,18,20,42,8,10};
        int key=8;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key Found at the index of "+i);
            }
        }
    }

}
