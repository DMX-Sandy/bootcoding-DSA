package com.bootcoding.dsa.collection_Framework.list;

import java.util.Scanner;

public class SpecialStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            if (s.length() >= 4 && (hasDistinctChars(s.substring(0, 2)) || s.charAt(0) == s.charAt(1)) &&
                    hasAllChars(s.substring(0, 2), s.substring(2))) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean hasDistinctChars(String s) {
        return s.charAt(0) != s.charAt(1);
    }

    private static boolean hasAllChars(String s1, String s) {
        for (int i = 0; i < s1.length(); i++) {
            if (s.indexOf(s1.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}

