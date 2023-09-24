package lab2.number5;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Гигант", 2);
        Dog dog2 = new Dog("Крот", 4);
        Dog dog3 = new Dog("Некто", 3);

        System.out.println("Информация о собаках:");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("\nПеревод возраста собак в человеческий возраст:");
        System.out.println(dog1.getName() + ": " + dog1.convertToHumanAge() + " лет");
        System.out.println(dog2.getName() + ": " + dog2.convertToHumanAge() + " лет");
        System.out.println(dog3.getName() + ": " + dog3.convertToHumanAge() + " лет");
    }
}
