package com.java.logicals;
import java.util.*;
import java.util.stream.Collectors;

public class PartitionOddEven {
    public static void main(String[] args) {
        // Sample input list
        List<Integer> list = Arrays.asList(10, 21, 4, 45, 66, 93, 1);

        // Partition the list into even and odd using Streams
        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Retrieve even and odd lists
        List<Integer> evenNumbers = result.get(true);
        List<Integer> oddNumbers = result.get(false);

        // Print the results
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
