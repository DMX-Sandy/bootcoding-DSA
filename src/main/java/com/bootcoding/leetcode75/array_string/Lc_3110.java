package com.bootcoding.leetcode75.array_string;

public class Lc_3110 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
            int res = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                res += Math.abs(s.charAt(i) - s.charAt(i + 1));
            }
            return res;
    }

}
