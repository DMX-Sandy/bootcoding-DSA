package com.bootcoding.leetcode75.array_string;

import java.util.Arrays;

public class LC_2962 {
    public static void main(String[] args) {
        int [] nums={1,3,2,3,3};
        int k = 2;
    }
    public long countSubarrays(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int l = 0,r=0,n=nums.length;

        while (r < n) {
            k -= nums[r] == mx ? 1 : 0;
            r++;
            while (k == 0) {
                k += nums[l] == mx ? 1 : 0;
                l++;
            }
            ans += l;
        }

        return ans;
    }
}
