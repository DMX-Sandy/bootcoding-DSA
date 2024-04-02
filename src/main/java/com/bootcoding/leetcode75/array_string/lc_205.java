package com.bootcoding.leetcode75.array_string;

import java.util.HashMap;

public class lc_205 {
    public static void main(String[] args) {
        String s = "Add";
        String t = "Pull";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {

        HashMap< Character , Character > map = new HashMap <>();

        for(int i = 0 ; i < s.length(); i++){
            if( !map.containsKey(s.charAt(i)) ){
                if( map.containsValue(t.charAt(i)) ){
                    return false;
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }else{
                if( map.get(s.charAt(i)) != t.charAt(i) ){
                    return false;
                }
            }
        }
        return true;
    }
}
