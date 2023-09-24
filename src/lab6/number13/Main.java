package lab6.number13;

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();

        // Создаем наблюдателей
        Observer observer1 = new TextObserver("Observer 1");
        Observer observer2 = new TextObserver("Observer 2");

        // Добавляем наблюдателей
        observableStringBuilder.addObserver(observer1);
        observableStringBuilder.addObserver(observer2);

        // Изменяем состояние StringBuilder
        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("world!");

        // Удаляем наблюдателя
        observableStringBuilder.removeObserver(observer1);

        // Изменяем состояние StringBuilder еще раз
        observableStringBuilder.delete(7, 12);
    }
}
