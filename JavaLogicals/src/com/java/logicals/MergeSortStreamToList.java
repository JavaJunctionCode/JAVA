package com.java.logicals;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortStreamToList {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8};
        int[] arr2 = {3, 9, 1};

        List<Integer> result = Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Merged and Sorted List: " + result);
    }
}
