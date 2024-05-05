package com.bootcoding.leetcode75.array_string;

public class LC_1700 {
    public static void main(String[] args) {
        int [] student = {1,1,0,0};
        int [] sandwiches = {0,1,0,1};
        System.out.println(countStudents(student,sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for (final int student : students)
            ++count[student];

        for (int i = 0; i < sandwiches.length; ++i) {
            if (count[sandwiches[i]] == 0)
                return sandwiches.length - i;
            --count[sandwiches[i]];
        }
        return 0;

    }
}
