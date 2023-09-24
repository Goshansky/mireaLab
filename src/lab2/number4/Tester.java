package lab2.number4;

public class Tester {

    public static void main(String[] args) {
        Shop shop = new Shop();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера");
            System.out.println("4. Выйти");

            int choice = shop.getIntegerInput("Выберите действие");
            switch (choice) {
                case 1:
                    shop.addComputer();
                    break;
                case 2:
                    shop.removeComputer();
                    break;
                case 3:
                    shop.findComputer();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
