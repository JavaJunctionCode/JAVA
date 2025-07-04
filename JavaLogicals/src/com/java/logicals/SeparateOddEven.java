package com.java.logicals;



public class SeparateOddEven {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
