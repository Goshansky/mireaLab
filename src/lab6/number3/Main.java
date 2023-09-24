package lab6.number3;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Lion");

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Car brand: " + car.getName());
        System.out.println("Animal species: " + animal.getName());
    }
}
