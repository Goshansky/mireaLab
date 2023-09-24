package lab6.number11;

class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
