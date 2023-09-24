package lab3.number5;

import java.util.Random;
import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Запрос пользователя на ввод размера массива
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите корректное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Создание массива из n случайных целых чисел в диапазоне [0, n]
        int[] randomArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(n + 1); // Генерируем числа от 0 до n
        }

        // Вывод первого массива
        System.out.println("Первый массив:");
        printArray(randomArray);

        // Создание второго массива только из четных элементов
        int evenCount = 0;
        for (int num : randomArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount > 0) {
            int[] evenArray = new int[evenCount];
            int index = 0;
            for (int num : randomArray) {
                if (num % 2 == 0) {
                    evenArray[index++] = num;
                }
            }

            // Вывод второго массива
            System.out.println("\nВторой массив (только четные элементы из первого массива):");
            printArray(evenArray);
        } else {
            System.out.println("\nВ первом массиве нет четных элементов.");
        }
    }

    // Метод для вывода массива на экран
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
