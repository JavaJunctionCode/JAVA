package com.java.logicals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CommonElements {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		Set<Integer> set1 = new HashSet<>(list1);
		Set<Integer> set2 = new HashSet<>(list2);
		
		Set<Integer> collect = set1.stream().filter(set2::contains).collect(Collectors.toSet()); // o/p: 3, 4, 5)
		System.out.println("Common elements: " + collect); // o/p: Common elements:[3, 4, 5]);
		

	}
}