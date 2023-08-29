//Copy even index element of an array into another array.
package com.bootcoding.dsa.array.OneDArray;

public class copyEvenIndexElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        int index=0;
        int [] arr2=new int [count];
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                arr2[index++]=arr[i];

            }
        }
        for (int i=0;i<count;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
