package com.bootcoding.dsa.Arrrays.operations.general;

public class InsertAtMiddle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9,0};
        int value= 5;
        int position=4;

        int [] dummy=new int[arr.length+1];

        for(int i=0;i<position;i++){
            dummy[i]=arr[i];
        }

        dummy[position]=value;

        for(int i=position+1;i<dummy.length;i++){
            dummy[i]=arr[i-1];
        }

        arr=dummy;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
