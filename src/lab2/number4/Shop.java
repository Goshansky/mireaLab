package lab2.number4;
import java.util.ArrayList;
import java.util.List;

class Shop implements Input {
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer() {
        String brand = getStringInput("Введите бренд компьютера");
        String model = getStringInput("Введите модель компьютера");
        double price = getDoubleInput("Введите цену компьютера");
        Computer computer = new Computer(brand, model, price);
        computers.add(computer);
        System.out.println("Компьютер добавлен в магазин.");
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст");
            return;
        }

        System.out.println("Список доступных компьютеров:");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println((i + 1) + ". " + computers.get(i));
        }

        int choice;
        while (true) {
            choice = getIntegerInput("Выберите номер компьютера для удаления");
            if (choice >= 1 && choice <= computers.size()) {
                break;
            } else {
                System.out.println("Неверный номер компьютера. Попробуйте снова.");
            }
        }

        Computer removedComputer = computers.remove(choice - 1);
        System.out.println("Компьютер " + removedComputer + " удален из магазина.");
    }

    // Метод для поиска компьютера по бренду и модели
    public void findComputer() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст");
            return;
        }

        String brand = getStringInput("Введите бренд компьютера");
        String model = getStringInput("Введите модель компьютера");

        boolean found = false;
        System.out.println("Результаты поиска:");
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                System.out.println(computer);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Компьютер не найден.");
        }
    }

    public int getIntegerInput(String str) {
        System.out.print(str + ": ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Введите корректное число: ");
            }
        }
    }
}
