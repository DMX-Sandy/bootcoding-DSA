package com.bootcoding.leetcode75.array_string;

public class Lc_2486 {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coaching";
        System.out.println(appendCharacters(s,t));
    }
    public static int appendCharacters(String s, String t) {
        int m = s.length();
        int n = t.length();

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) j++;
            i++;
        }

        return n - j;
    }
}
