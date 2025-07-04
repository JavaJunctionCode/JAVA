package com.java.logicals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceProgram {
	public static void main(String[] args) {
		System.out.println("Type-1 with Array of String");
		List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "aa", "cc", "dd", "ee");
		Map<Object, Long> map1 = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map1); // {ee=1, dd=2, cc=2, bb=1, aa=2} System.out.println("Type-2 with Array of
									// Integer");
		List<Integer> list1 = Arrays.asList(12, 85, 6, 5, 12, 6, 6, 5, 66, 77);
		Map<Object, Long> map2 = list1.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map2); // {66=1, 5=2, 85=1, 6=3, 12=2, 77=1} System.out.println("Type-3 with String");
		String str = "B Rajveer Yadav";
		Map<Object, Long> map3 = str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map3); 
	}
}