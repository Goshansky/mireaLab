package lab4_1.number3;

public class Main {
    public static void main(String[] args) {
        // Создаем два объекта класса Person
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 30);

        // Вызываем методы для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
