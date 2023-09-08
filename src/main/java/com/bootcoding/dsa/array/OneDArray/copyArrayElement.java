package com.bootcoding.dsa.array.OneDArray;

public class copyArrayElement {
    public static void main(String[] args) {
        int [] arr={10,20,30,50,90};
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
