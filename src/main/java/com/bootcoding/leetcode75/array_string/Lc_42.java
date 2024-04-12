package com.bootcoding.leetcode75.array_string;

public class Lc_42 {
    public static void main(String[] args) {
        int [] arr = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int n=arr.length;

        if(n<=2) {
            return 0;
        }
        int left[]=new int[n];
        left[0]=arr[0];

        //left
        for(int i=1; i<n;i++) {
            if(arr[i]>left[i-1]) {
                left[i]=arr[i];
            }else {
                left[i]=left[i-1];
            }
        }

        int right[]=new int [n];
        right[n-1]=arr[n-1];

//	  right
        for(int i=n-2; i>=0;i--) {
            if(arr[i]>right[i+1]) {
                right[i]=arr[i];
            }else {
                right[i]=right[i+1];
            }
        }
        int sum=0;

        for(int i=0; i<n;i++) {
            int waterLeve=Math.min(left[i],right[i]);
            int trappedWater=waterLeve-arr[i];
            if(trappedWater>0) {
                sum+=trappedWater;
            }
        }
        return sum;
    }
}
