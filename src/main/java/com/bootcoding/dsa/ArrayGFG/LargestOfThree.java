//Find the largest three distinct elements in an array
package com.bootcoding.dsa.ArrayGFG;

public class LargestOfThree {
    public static void main(String[] args) {
        //int arr[]={10,4,3,50,23};
        int []arr={100,600,500,400,900,200};


        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        System.out.print("The lagest Three element in ana array is : ");
        for(int k=0;k<3;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
