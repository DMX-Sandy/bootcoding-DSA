package com.bootcoding.dsa.Arrrays.operations.general;

public class Deleteelement {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToRemove = 0;

        if (indexToRemove >= 0 && indexToRemove < originalArray.length) {

            int newSize = originalArray.length - 1 ;

            int[] newArray = new int[newSize];

            for (int i = 0, j = 0; i < originalArray.length; i++) {
                if (i != indexToRemove) {
                    newArray[j] = originalArray[i];
                    j++;
                }
            }

            originalArray = newArray;

            for (int value : originalArray) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Invalid index to remove.");
        }
    }
}
