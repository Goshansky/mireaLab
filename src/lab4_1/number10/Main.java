package lab4_1.number10;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport airplane = new Airplane();

        int passengers = 100;
        double cargoWeight = 500.0;

        // Пример расчета времени и стоимости для перевозки пассажиров и грузов
        System.out.println("Перевозка " + passengers + " пассажиров на " + car.getName() + ":");
        System.out.println("Время: " + car.calculatePassengerTime(passengers) + " часа");
        System.out.println("Стоимость: $" + car.calculatePassengerCost(passengers));

        System.out.println("\nПеревозка " + cargoWeight + " кг грузов на " + airplane.getName() + ":");
        System.out.println("Время: " + airplane.calculateCargoTime(cargoWeight) + " часа");
        System.out.println("Стоимость: $" + airplane.calculateCargoCost(cargoWeight));
    }
}
