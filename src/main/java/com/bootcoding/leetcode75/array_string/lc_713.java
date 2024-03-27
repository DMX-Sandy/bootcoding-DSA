package com.bootcoding.leetcode75.array_string;

public class lc_713 {
    public static void main(String[] args) {
        int [] nums={50,5,2,6};
        int k=100;

        System.out.println(numSubarrayProductLessThanK(nums,k));

    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            int t = 1;
            for(int j=i;j<nums.length;j++)
            {
                t*=nums[j];
                if(t<k) ans++;
                else break;
            }
        }

        return ans;
    }
}
