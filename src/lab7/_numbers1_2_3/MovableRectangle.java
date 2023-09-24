package lab7._numbers1_2_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MovablePoint(x1, y1);
        bottomRight = new MovablePoint(x2, y2);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "MovableRectangle: TopLeft " + topLeft + ", BottomRight " + bottomRight;
    }

    // Метод для перевода числовых значений в строку
    public static String convertToString(double value) {
        return String.valueOf(value);
    }

    // Метод для проверки скорости движения точек
    public boolean speedTest() {
        return topLeft.speedTest(bottomRight);
    }
}
