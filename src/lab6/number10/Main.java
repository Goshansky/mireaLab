package lab6.number10;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера по марке");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите марку компьютера (HP, Dell, Lenovo, Asus, Acer): ");
                    Brand brand = Brand.valueOf(scanner.nextLine());
                    System.out.print("Введите модель процессора: ");
                    String processorModel = scanner.nextLine();
                    System.out.print("Введите объем памяти (в ГБ): ");
                    int memorySize = scanner.nextInt();
                    System.out.print("Введите размер монитора (в дюймах): ");
                    int monitorSize = scanner.nextInt();

                    Processor processor = new Processor(processorModel);
                    Memory memory = new Memory(memorySize);
                    Monitor monitor = new Monitor(monitorSize);
                    Computer computer = new Computer(brand, processor, memory, monitor);

                    shop.addComputer(computer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    // Реализуйте удаление компьютера
                    break;
                case 3:
                    System.out.print("Введите марку компьютера для поиска: ");
                    Brand searchBrand = Brand.valueOf(scanner.nextLine());
                    List<Computer> foundComputers = shop.searchComputersByBrand(searchBrand);
                    if (foundComputers.isEmpty()) {
                        System.out.println("Компьютеры не найдены.");
                    } else {
                        System.out.println("Найденные компьютеры:");
                        for (Computer foundComputer : foundComputers) {
                            System.out.println(foundComputer);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}
