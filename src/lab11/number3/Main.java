package lab11.number3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Создаем объект Student с датой рождения
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse("15.09.2000");

        Student student = new Student("Иван", "Иванов", "Информатика", 2, "Группа А", birthDate);

        // Выводим стандартное строковое представление
        System.out.println(student.toString());

        // Выводим строковое представление даты рождения в другом формате (например, "dd MMMM yyyy")
        System.out.println("Дата рождения в формате 'dd MMMM yyyy': " + student.getFormattedBirthDate("dd MMMM yyyy")+" года");
    }
}
