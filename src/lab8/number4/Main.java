package lab8.number4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // количество цифр в числе
        int s = scanner.nextInt(); // сумма цифр
        int count = countNumbersWithSumRecursive(k, s, 1, "");;
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + count);
    }

    public static int countNumbersWithSumRecursive(int k, int s, int digit, String currentNumber) {
        if (k == 0) {
            // Если количество цифр в числе достигло k
            int sum = calculateDigitSum(currentNumber);
            if (sum == s && !currentNumber.startsWith("0")) {
                // Если сумма цифр равна s и число не начинается с 0
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int i = digit; i <= 9; i++) {
            // Рекурсивно генерируем числа, добавляя текущую цифру к текущему числу
            count += countNumbersWithSumRecursive(k - 1, s, i, currentNumber + i);
        }

        return count;
    }

    public static int calculateDigitSum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }
}
