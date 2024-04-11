package com.bootcoding.leetcode75.array_string;

import java.util.Stack;

public class Lc_402 {

    public static void main(String[] args) {
        String num  = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num,k));
    }
    public static String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (k > 0 && !stk.isEmpty() && stk.peek() > c) {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while (k > 0) {
            stk.pop();
            k--;
        }
        for (char c : stk) {
            if (ans.length() == 0 && c == '0') continue;
            ans.append(c);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
