package com.bootcoding.dsa.Arrrays.operations.general;

public class print {
    public static void main(String[] args) {
        int [] arr={7,8,4,5,2,1,0};
      int left=0;
      int right=arr.length-1;

      while(left<right){
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;

          left++;
          right--;
      }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
