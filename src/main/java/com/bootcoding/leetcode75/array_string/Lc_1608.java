package com.bootcoding.leetcode75.array_string;

import java.util.Arrays;

public class Lc_1608 {
    public static void main(String[] args) {
        int [] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (nums[0] >= n) return n;

        for (int i = 1; i <= n; i++) {
            if (nums[n - i] >= i && (n - i - 1 < 0 || nums[n - i - 1] < i)) {
                return i;
            }
        }

        return -1;
    }
}
