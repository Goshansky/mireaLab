package lab6.number10;

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor: " + model;
    }
}
