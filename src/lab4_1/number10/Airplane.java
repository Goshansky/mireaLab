package lab4_1.number10;

class Airplane extends Transport {
    public Airplane() {
        super("Самолет");
    }

    @Override
    public double calculatePassengerTime(int passengers) {
        // Рассчет времени для самолета (просто для примера)
        return passengers * 0.05;
    }

    @Override
    public double calculatePassengerCost(int passengers) {
        // Рассчет стоимости для самолета (просто для примера)
        return passengers * 50.0;
    }

    @Override
    public double calculateCargoTime(double cargoWeight) {
        // Рассчет времени для перевозки грузов самолетом (просто для примера)
        return cargoWeight * 0.02;
    }

    @Override
    public double calculateCargoCost(double cargoWeight) {
        // Рассчет стоимости для перевозки грузов самолетом (просто для примера)
        return cargoWeight * 100.0;
    }
}
