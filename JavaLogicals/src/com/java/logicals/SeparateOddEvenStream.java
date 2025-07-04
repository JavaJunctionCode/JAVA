package com.java.logicals;
import java.util.Arrays;

public class SeparateOddEvenStream {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        System.out.println("Even numbers:");
        Arrays.stream(numbers)
              .filter(n -> n % 2 == 0)
              .forEach(n -> System.out.print(n + " "));

        System.out.println("\nOdd numbers:");
        Arrays.stream(numbers)
              .filter(n -> n % 2 != 0)
              .forEach(n -> System.out.print(n + " "));
    }
}
