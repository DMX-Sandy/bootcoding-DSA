package com.bootcoding.leetcode75.array_string;

import java.util.HashMap;
import java.util.Map;

public class Lc_523 {
    public static void main(String[] args) {
        int [] nums = {23,2,6,4,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums,k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        // Map to store the remainders and their corresponding index
        Map<Integer, Integer> remaindersFound = new HashMap<>();
        int currSum = 0;
        remaindersFound.put(0, -1); // To handle the case when subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int remainder = currSum % k;

            if (remaindersFound.containsKey(remainder)) {
                // Check if the length of the subarray is at least 2
                if (i - remaindersFound.get(remainder) >= 2) {
                    return true;
                }
            } else {
                remaindersFound.put(remainder, i);
            }
        }

        return false;
    }
}
