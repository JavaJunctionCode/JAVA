package com.java.logicals;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8};
        int[] arr2 = {3, 9, 1};

        int[] result = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the result
        System.out.println("Merged and Sorted Array: " + Arrays.toString(result));
    }
}
