package lab11.number2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Получение текущей даты и времени
        Date currentDate = new Date();

        System.out.print("Введите дату и время в формате 'гггг-мм-дд чч:мм:сс': ");
        String userInput = scanner.nextLine();
        // 2024-10-10 16:00:00

        // Парсинг даты, введенной пользователем
        Date userDate = dateFormat.parse(userInput);

        // Сравнение дат
        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата и время прошли.");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата и время еще не наступили.");
        } else {
            System.out.println("Введенная дата и время совпадают с текущими.");
        }
    }
}
