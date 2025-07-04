package com.java.logicals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 10, 45, 85, 79, 10, 85, 36, 45 };
		List<Integer> list = Arrays.asList(arr);
//1st method using distinct() method
		list.stream().distinct().forEach(System.out::println);
		System.out.println("--");
//2nd method
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("--");
// After removing duplicates, sorted element in ascending order
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		set.stream().sorted().forEach(System.out::println);
		System.out.println("--");
// After removing duplicates, sorted element in descending order
		set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}