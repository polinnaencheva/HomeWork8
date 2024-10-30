package org.example;

public class Triangle {
    public static double calculateArea(double a, double b, double c) {
        // Полупериметърът на триъгълника
        double s = (a + b + c) / 2;

        // Лицето на триъгълника по формулата на Херон
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double sideA = 5;
        double sideB = 6;
        double sideC = 7;

        double area = calculateArea(sideA, sideB, sideC);
        System.out.println("Лицето на триъгълника е: " + area);
    }
}


