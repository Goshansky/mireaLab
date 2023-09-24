package lab4_1.number2;

public class Phone {
    public String number;
    public String model;
    public double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (перегрузка)
    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    // Конструктор без параметров (перегрузка)
    public Phone() {
        this("", "");
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для принятия звонка с указанием имени звонящего
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод для принятия звонка с указанием имени и номера звонящего
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    // Метод для отправки сообщения с переменным числом аргументов (номеров телефонов)
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
