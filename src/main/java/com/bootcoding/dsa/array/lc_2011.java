package com.bootcoding.dsa.array;

public class lc_2011 {
    public static void main(String[] args) {
        int x=0;
        int sum=0;
        String []nums={"++X","++X","X++"};

        for (int i=0;i<nums.length;i++){
            if(nums[i].equals("X++")){
                x=x+1;
            }else if(nums[i].equals("++X")){
                x=x+1;
            }else if(nums[i].equals("--X")){
                x=x-1;
            }else if(nums[i].equals("X--")){
                x=x-1;
            }


        }
        System.out.println(x);
    }
}
