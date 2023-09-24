package lab4_1.number7;

public class Shkila extends StudyPeople{
    private int _class;

    public Shkila(String name, int age, int _class) {
        super(name, age);
        this._class = _class;
    }

    public int get_class() {
        return _class;
    }

    @Override
    public String toString() {
        return super.toString() + ", Класс: " + _class;
    }
}
