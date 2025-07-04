package com.java.logicals;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Count occurrences of each string
        Map<String, Long> counts = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the frequency map
        System.out.println("Element frequencies:");
        counts.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
