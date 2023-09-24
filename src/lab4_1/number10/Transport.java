package lab4_1.number10;

abstract class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод для подсчета времени перевозки пассажиров
    public abstract double calculatePassengerTime(int passengers);

    // Метод для подсчета стоимости перевозки пассажиров
    public abstract double calculatePassengerCost(int passengers);

    // Метод для подсчета времени перевозки грузов
    public abstract double calculateCargoTime(double cargoWeight);

    // Метод для подсчета стоимости перевозки грузов
    public abstract double calculateCargoCost(double cargoWeight);
}
