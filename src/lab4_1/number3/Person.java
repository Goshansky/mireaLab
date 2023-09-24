package lab4_1.number3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        // Конструктор без параметров
        fullName = "Неизвестный";
        age = 0;
    }

    public Person(String fullName, int age) {
        // Конструктор с параметрами
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " двигается");
    }
}
