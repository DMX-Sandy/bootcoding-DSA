package com.bootcoding.leetcode75.array_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lc_2597 {
    public static void main(String[] args) {
        int [] nums = {2,4,6};
        int k = 2;
        System.out.println(beautifulSubsets(nums,k));
    }
    public static int beautifulSubsets(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        // Iterate over all possible subsets using bitmasks
        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

            if (isBeautiful(subset, k)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isBeautiful(List<Integer> subset, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : subset) {
            if (seen.contains(num - k) || seen.contains(num + k)) {
                return false;
            }
            seen.add(num);
        }
        return true;
    }
}
