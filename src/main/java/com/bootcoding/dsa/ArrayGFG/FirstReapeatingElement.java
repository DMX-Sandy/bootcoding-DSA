//Find the first repeating element in an array of integers.
package com.bootcoding.dsa.ArrayGFG;

public class FirstReapeatingElement {
    public static void main(String[] args) {
        int []arr={5, 6, 3, 4, 3, 5, 6};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        int s[]=new int[count];

        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    s[index++]=arr[i];
                }
            }
        }
        System.out.println("The first repeating element in ana array is : "+s[0]);
    }
}
