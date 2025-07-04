package com.java.logicals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingNumberAndString {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(25, 85, 45, 1, 2, 3, 5, 4);
		System.out.println("Sorting elements in Ascending order");
		list.stream().sorted().forEach(System.out::println); // 1,2,3,4,5,25,45,85
		System.out.println("Sorting elements in Descending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // 85,45,25,5,4,3,2,1
		List<String> str = Arrays.asList("Pawan", "Pratap", "Singh", "Patna", "Bangalore", "Gaya");
		System.out.println("Sorting string in Ascending order");
		str.stream().sorted().forEach(System.out::println);
		System.out.println("Sorting string in Descending order");
		str.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		System.out.println("**********************************");
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println); 
		

		System.out.println("*****************+++++*****************");
		list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println); // 1,2,3,4,5,25,45,85));
	}
}