package lab3.Zadanie3.number2;

import java.util.Scanner;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в интернет-магазин!");

        System.out.print("Введите наименование товара: ");
        String productName = scanner.nextLine();

        System.out.print("Введите цену товара: ");
        double price = scanner.nextDouble();

        System.out.print("Выберите валюту для оплаты (USD, EUR, GBP): ");
        scanner.nextLine(); // Считываем символ новой строки после числа
        String currency = scanner.nextLine().toUpperCase();

        System.out.print("Введите количество товара: ");
        int quantity = scanner.nextInt();

        double totalCost = calculateTotalCost(price, quantity, currency);

        System.out.println("Итого: " + totalCost + " " + currency);
    }

    public static double calculateTotalCost(double price, int quantity, String currency) {
        double exchangeRate = getExchangeRate(currency); // Здесь можно использовать текущий курс обмена

        if (exchangeRate == 0) {
            System.out.println("Не удалось получить курс обмена для выбранной валюты.");
            return 0;
        }

        double totalCost = price * quantity * exchangeRate;
        return totalCost;
    }

    // Здесь можно добавить логику для получения текущего курса обмена из внешних источников
    public static double getExchangeRate(String currency) {
        // В данном примере, мы предполагаем, что у нас есть фиксированный курс для каждой валюты
        switch (currency) {
            case "USD":
                return 1.0; // 1 USD = 1 USD
            case "EUR":
                return 0.85; // Примерный курс, 1 USD = 0.85 EUR
            case "GBP":
                return 0.72; // Примерный курс, 1 USD = 0.72 GBP
            default:
                return 0; // Возвращаем 0 для неизвестных валют
        }
    }
}