package lab6.number11;

class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
