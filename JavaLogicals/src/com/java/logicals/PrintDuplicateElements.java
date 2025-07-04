package com.java.logicals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElements {
	public static void main(String[] args) {
		System.out.println("Working with Number");
		System.out.println("1st Method");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 5, 6, 7);
		Set<Integer> set = new HashSet<>();
		List<Integer> dup = list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(dup);
		System.out.println("2nd Method");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 5, 6, 7);
		list1.stream().filter(i -> !set.add(i)).forEach(System.out::println); // 4,3,2
		System.out.println("Working with String");
		Set<String> set1 = new HashSet<>();
		List<String> names = Arrays.asList("B", "Rajveer", "Yadav", "Patna", "Bambam", "Rajveer", "A", "A", "B");
		List<String> name1 = names.stream().filter(i -> !set1.add(i)).collect(Collectors.toList());
		System.out.println(name1); // [Pawan, Singh, A]
	}
}