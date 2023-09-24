package lab6.number13;
import java.util.ArrayList;
import java.util.List;

class ObservableStringBuilder {
    private StringBuilder stringBuilder;
    private List<Observer> observers;

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void append(String text) {
        stringBuilder.append(text);
        notifyObservers();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.stringBuilder);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
