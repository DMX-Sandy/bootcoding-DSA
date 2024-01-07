package com.bootcoding.dsa.Arrrays.operations.general;

public class Delete {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int indextoremove=4;

        if(indextoremove>=0 && indextoremove< arr.length){
            int [] dummy= new int[arr.length-1];
            int j=0;
            for(int i=0;i< arr.length;i++){
                if(i != indextoremove){
                    dummy[j]=arr[i];
                    j++;
                }
            }

            for(int i=0;i<dummy.length;i++){
                System.out.print(dummy[i]+" ");
            }
        }
        else{
            System.out.println("Array element not found");
        }
    }
}
