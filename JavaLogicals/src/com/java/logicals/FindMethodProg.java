package com.java.logicals;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethodProg {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ten", "two", "three", "four", "three", "one", "five");
		List<Integer> numList = Arrays.asList(12, 25, 48, 75, 63, 25, 64);
//findAny() method
		Optional<String> fAny = list.stream().findAny();
		System.out.println(fAny.get()); // Ten
		
		Optional<Integer> fAnyNum = numList.stream().findAny();
		
		System.out.println(fAnyNum.get()); // 12
		System.out.println("---");
//findFirst() method
		Optional<String> fFirst = list.stream().findFirst();
		System.out.println(fFirst.get()); // Ten
		
		Optional<Integer> fFirstNum = numList.stream().findFirst();
		System.out.println(fFirstNum.get()); // 12

		Optional<Integer> optional = numList.parallelStream().findAny();
		System.out.println("Parallel :" +optional.get()); // 12 or any other number based on parallel execution);
	
	}
}