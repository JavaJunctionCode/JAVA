package com.java.logicals;

import java.util.stream.Stream;

public class Print5EvenNumber {
	public static void main(String[] args) {
		Stream.iterate(0, n -> n + 1).filter(i -> i % 2 == 0).limit(10).forEach(System.out::println);
// 10,12,14,16,18
	}
}