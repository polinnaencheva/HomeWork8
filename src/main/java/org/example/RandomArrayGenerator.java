package org.example;
import java.util.Random;
public class RandomArrayGenerator  {
        public static int[] generateRandomArray(int length) {
            int[] array = new int[length];
            Random random = new Random();

            // Запълване на масива със случайни числа
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(100); // Генерира случайно число от 0 до 99
            }

            return array;
        }

        public static void main(String[] args) {
            int[] randomArray = generateRandomArray(10);

            System.out.print("Случайно генериран масив: ");
            for (int num : randomArray) {
                System.out.print(num + " ");
            }
        }
    }


