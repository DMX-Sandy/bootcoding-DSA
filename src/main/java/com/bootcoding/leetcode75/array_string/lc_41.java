package com.bootcoding.leetcode75.array_string;

import java.util.HashMap;

public class lc_41 {

    public static void main(String[] args) {
        int nums[]={1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mp.put(num, true);
            maxi = Math.max(maxi, num);
        }
        for (int i = 1; i < maxi; i++) {
            if (!mp.containsKey(i))
                return i;
        }
        return maxi < 0 ? 1 : maxi + 1;
    }
}
