package com.java.logicals;
import java.util.Arrays;

public class MergeSortManual {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8};
        int[] arr2 = {3, 9, 1};

        // Create a new array to hold all elements
        int[] merged = new int[arr1.length + arr2.length];

        // Copy both arrays into merged array
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(merged);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(merged));
    }
}
