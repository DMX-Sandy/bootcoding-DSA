package com.bootcoding.dsa.array.OneDArray;

public class lc1748 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};


                int temp=0;
                for (int i=0;i<nums.length;i++){
                    if(nums[i]!=0){
                        nums[temp++]=nums[i];

                    }
                }

                while(temp<nums.length){
                    nums[temp++]=0;
                }

            }
        }



