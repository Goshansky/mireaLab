package lab3.number3;
import java.util.Random;

public class number3 {
    public static void main(String[] args) {
        int[] numbers = new int[4]; // Создаем массив из 4 элементов
        Random random = new Random();

        // Заполняем массив случайными числами от 10 до 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10; // Генерируем числа от 10 до 99
        }

        // Выводим массив на экран в строку
        System.out.print("Массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Перевод строки

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isIncreasing = false;
                break; // Выходим из цикла, если найден несоответствующий элемент
            }
        }

        // Выводим сообщение на экран
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
