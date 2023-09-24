package lab3.number1;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива

        // Создание массива с использованием Math.random()
        double[] randomArray1 = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomArray1[i] = Math.random() * 100; // Генерируем случайные числа от 0 до 100
        }

        // Вывод несортированного массива (Math.random())
        System.out.println("Массив с использованием Math.random():");
        printArray(randomArray1);

        // Сортировка массива (Math.random())
        Arrays.sort(randomArray1);

        // Вывод отсортированного массива (Math.random())
        System.out.println("\nОтсортированный массив с использованием Math.random():");
        printArray(randomArray1);

        // Создание массива с использованием класса Random
        double[] randomArray2 = new double[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray2[i] = random.nextDouble() * 100; // Генерируем случайные числа от 0 до 100
        }

        // Вывод несортированного массива (класс Random)
        System.out.println("\nМассив с использованием класса Random:");
        printArray(randomArray2);

        // Сортировка массива (класс Random)
        Arrays.sort(randomArray2);

        // Вывод отсортированного массива (класс Random)
        System.out.println("\nОтсортированный массив с использованием класса Random:");
        printArray(randomArray2);
    }

    // Метод для вывода массива на экран
    private static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
