package lab11.number1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {
        String developerLastName = "Фамилия Разработчика"; // Замените на вашу фамилию

        // Дата и время получения задания (текущая дата и время)
        Date dateAssigned = new Date();

        // Дата и время сдачи задания (в данном случае +7 дней от текущей даты)
        long currentTimeMillis = System.currentTimeMillis();
        long deadlineMillis = currentTimeMillis + 7 * 24 * 60 * 60 * 1000; // +7 дней в миллисекундах
        Date dateSubmitted = new Date(deadlineMillis);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateAssigned));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateSubmitted));
    }
}
