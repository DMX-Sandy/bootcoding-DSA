//Copy odd element of an array into another in a reverse order.
package com.bootcoding.dsa.array.OneDArray;

public class copyOddElmentReverse {
    public static void main(String[] args) {
        int[] arr = {10, 23, 33, 49, 50};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int index=count-1;
        int[] arr2 = new int[count];
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] % 2 != 0) {
//                arr2[index--] = arr[j];
//            }
//        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2 != 0){
                arr2[i]= arr[i];
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.println();
        }

//        for(int k = 0;k<count;k++){
//            System.out.print(arr2[k]+" ");
//        }
    }
}
