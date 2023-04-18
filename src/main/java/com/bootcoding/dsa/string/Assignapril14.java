/*String Assignment:
Consider student results is published in following format
Marks1,Marks2,Marks3
For Example: "72,65,77"
Calculate its average and percentage and append it to input string and print in following format
72,65,77,XX,XX*/
package com.bootcoding.dsa.string;

public class Assignapril14 {
    public static void main(String[] args) {
        String [] marks={"75","66","77"};
        int [] arr=new int[marks.length+2];
        for(int i=0;i<marks.length;i++){
            int j=Integer.parseInt(marks[i]);
            arr[i]+=j;

        }
       int sum=0;
        for(int i=0;i< arr.length-2;i++){
            sum+=arr[i];
        }
        int avg=sum/ (arr.length-2);
         arr[arr.length-2]=avg;


        int total=(arr.length-2)*100;
        int per=(sum*100)/total;
        arr[arr.length-1]=per;
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }


    }



}



