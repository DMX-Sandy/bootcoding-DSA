package com.bootcoding.dsa.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={8,10,12,21,27,34,42};
        int key=34;

        int s=0;
        int e= arr.length-1;
        while (s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==key){
                System.out.println("Key Found at index: "+mid);
            }else if(arr[mid]>key){
                e=mid-1;
            }else{
                e=mid+1;
            }
        }
    }
}
