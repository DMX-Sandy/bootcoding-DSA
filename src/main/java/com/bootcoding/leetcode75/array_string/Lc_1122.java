package com.bootcoding.leetcode75.array_string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Lc_1122 {
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        System.out.println(relativeSortArray(arr1,arr2));
    }
    private static int rank(HashMap<Integer, Integer> map, int a) {
        return map.containsKey(a) ? map.get(a) : map.size();
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        List<Integer> arr1List = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        arr1List.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int rankA = rank(map, a);
                int rankB = rank(map, b);
                return rankA == rankB ? a.compareTo(b) : Integer.compare(rankA, rankB);
            }
        });

        return arr1List.stream().mapToInt(Integer::intValue).toArray();
    }
}
