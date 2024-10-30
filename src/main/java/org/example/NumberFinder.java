package org.example;

public class NumberFinder {
    public static int findMax(int a, int b, int c) {
        // намиране на максималното от три числа с Math.max
        return Math.max(a, Math.max(b, c)); // максимума измежду трите числа
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int maxNumber = findMax(num1, num2, num3);
        System.out.println("Най-голямото число е: " + maxNumber);
    }
}


