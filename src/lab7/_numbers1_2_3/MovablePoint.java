package lab7._numbers1_2_3;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Метод для перевода числовых значений в строку
    public static String convertToString(int value) {
        return String.valueOf(value);
    }

    // Метод для проверки скорости движения точек
    public boolean speedTest(MovablePoint otherPoint) {
        return (this.x == otherPoint.x && this.y == otherPoint.y);
    }
}
