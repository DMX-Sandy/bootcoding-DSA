package com.bootcoding.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class Lc_1992 {
    public static void main(String[] args) {
        int [] [] land = {{1,1},{1,1}};
        System.out.println(findFarmland(land));
    }
    public static int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();

        int m = land.length;
        int n = land[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int[] coordinates = findFarmlandCoordinates(land, i, j);
                    result.add(coordinates);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    private static int[] findFarmlandCoordinates(int[][] land, int row, int col) {
        int[] coordinates = new int[4];
        coordinates[0] = row;
        coordinates[1] = col;

        int m = land.length;
        int n = land[0].length;

        int r = row;
        int c = col;


        while (r < m && land[r][col] == 1) r++;
        while (c < n && land[row][c] == 1) c++;
        coordinates[2] = r - 1;
        coordinates[3] = c - 1;

        for (int i = row; i < r; i++) {
            for (int j = col; j < c; j++) {
                land[i][j] = 0;
            }
        }
        return coordinates;
    }
}
