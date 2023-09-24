package lab6.number4;

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return serviceName + ": $" + hourlyRate + " per hour";
    }
}
