package lab4_1.number10;

class Car extends Transport {
    public Car() {
        super("Автомобиль");
    }

    @Override
    public double calculatePassengerTime(int passengers) {
        // Рассчет времени для автомобиля (просто для примера)
        return passengers * 0.1;
    }

    @Override
    public double calculatePassengerCost(int passengers) {
        // Рассчет стоимости для автомобиля (просто для примера)
        return passengers * 5.0;
    }

    @Override
    public double calculateCargoTime(double cargoWeight) {
        // Рассчет времени для перевозки грузов автомобилем (просто для примера)
        return cargoWeight * 0.05;
    }

    @Override
    public double calculateCargoCost(double cargoWeight) {
        // Рассчет стоимости для перевозки грузов автомобилем (просто для примера)
        return cargoWeight * 10.0;
    }
}
