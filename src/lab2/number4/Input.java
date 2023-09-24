package lab2.number4;

import java.util.Scanner;

interface Input {
    Scanner scanner = new Scanner(System.in);

    default String getStringInput(String str) {
        System.out.print(str + ": ");
        return scanner.nextLine();
    }

    default double getDoubleInput(String str) {
        System.out.print(str + ": ");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Введите корректное число: ");
            }
        }
    }
}
