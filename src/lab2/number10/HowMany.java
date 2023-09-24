package lab2.number10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        // Разделяем введенную строку на слова, используя пробел как разделитель
        String[] words = input.split(" ");

        int wordCount = words.length;

        System.out.println("Вы ввели " + wordCount + " слов(а).");
    }
}
