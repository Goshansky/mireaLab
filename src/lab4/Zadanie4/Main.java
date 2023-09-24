package lab4.Zadanie4;

public class Main {
    public static void main(String[] args) {
        // Создание объектов для компонента процессора, памяти и монитора
        Processor processor = new Processor("Intel Core i7", 3.5, 8);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp U2719D", 27, "2560x1440");

        // Создание компьютера с заданными компонентами
        Computer computer = new Computer(ComputerBrand.HP, processor, memory, monitor);

        // Вывод информации о компьютере в консоль
        System.out.println(computer);
    }
}
