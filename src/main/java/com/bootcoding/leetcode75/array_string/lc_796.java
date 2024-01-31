package com.bootcoding.leetcode75.array_string;

public class lc_796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString( s , goal));

    }

        public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String s1= s.concat(s);
        return s1.contains(goal);
        }

}

