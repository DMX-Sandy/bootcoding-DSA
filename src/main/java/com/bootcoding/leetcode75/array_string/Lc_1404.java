package com.bootcoding.leetcode75.array_string;

public class Lc_1404 {
    public static void main(String[] args) {
        String s = "1101";
        System.out.println(numSteps(s));
    }
    public static int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        for (int i = s.length() - 1; i >= 1; i--) {
            int digit = ((s.charAt(i) - '0') + carry) % 2;

            if (digit == 0) {
                steps++;
            } else {
                carry = 1;
                steps += 2;
            }
        }

        return steps + carry;
    }
}
