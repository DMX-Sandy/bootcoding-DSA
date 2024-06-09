package com.bootcoding.leetcode75.array_string;

public class Lc_974 {
    public static void main(String[] args) {
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
    public static int subarraysDivByK(int[] nums, int k) {

        int res = 0;
        int prefix = 0;
        int[] arr = new int[k];
        arr[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i] % k + k) % k;
            res += arr[prefix];
            arr[prefix]++;
        }
        return res;
    }
}
