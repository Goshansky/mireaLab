package lab6.number10;

class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Computer: " + brand + "\n" + processor + "\n" + memory + "\n" + monitor;
    }
}
