package com.java.logicals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfDigitAndLetter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 7, 6, 5, 4, 3, 2, 1, 1);
		System.out.println(list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));
		
        // {1=3, 2=2, 3=2, 4=2, 5=2, 6=2, 7=3}
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map); // {1=3, 2=2, 3=2, 4=2, 5=2, 6=2, 7=3}
	
		System.out.println("For String");
		String str = "B Rajveer Yadav";
		
//		System.out.println(
//				str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(e -> e, Collectors.counting())));
		
		
//		Map<Object, Long> map1 = str.chars().mapToObj(i -> (char) i)
//				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//		System.out.println(map1);
//		
		
		Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
				
		
		
	}
}