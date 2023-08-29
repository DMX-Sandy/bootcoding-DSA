//Copy elements of an array into another array in a reverse order.
package com.bootcoding.dsa.array.OneDArray;

public class copyElementReverse {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int [] arr2= new int[arr.length];
        System.out.print("Old array is - ");
          for(int i =0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }

            for(int i =arr.length-1;i>=0;i--){
                arr2[i]=arr[i]; // processing element copy in a reverse order
            }
            // print new array
        System.out.println();
    System.out.print("New array is - ");
            for(int i =arr.length-1;i>=0;i--){
                System.out.print(arr2[i]+" ");
            }

    }
}
