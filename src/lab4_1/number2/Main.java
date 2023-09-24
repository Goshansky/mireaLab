package lab4_1.number2;

public class Main {
    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("123-456-789", "iPhone 12", 0.2);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        // Выводим значения переменных объектов на консоль
        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight + " кг");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight + " кг");
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight + " кг");

        // Принимаем звонки и отправляем сообщения
        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", "555-123-456");
        phone3.receiveCall("Charlie");

        phone1.sendMessage("111-222-333", "444-555-666");
        phone2.sendMessage("777-888-999");

    }
}
