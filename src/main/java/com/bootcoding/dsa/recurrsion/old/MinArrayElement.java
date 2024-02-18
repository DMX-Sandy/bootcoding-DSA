package com.bootcoding.dsa.recurrsion.old;

public class MinArrayElement {
    public static int min(int [] a,int i,int min){
        if(i==a.length){
            return min;
        }
//        if(min>a[i]){
//            min=a[i];
//        }
        Math.min(min,a[i]);
        return min(a,++i,min);

    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int res=min(a,0,a[0]);
        System.out.println(res);
    }
}
