package com.bootcoding.leetcode75.array_string;

public class Lc_1678 {
    public static void main(String[] args) {
        String s ="G()()()()(al)";
        String s1 = s.replace("()","o");
        String s2 = s1.replace("(al)","al");
        System.out.println(s2);

    }
}
