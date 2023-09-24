package lab7._numbers1_2_3;

public class Main {
    public static void main(String[] args) {
        // Тестирование MovablePoint
        System.out.println("Testing MovablePoint:");
        MovablePoint point1 = new MovablePoint(1, 2);
        MovablePoint point2 = new MovablePoint(3, 4);

        System.out.println("Initial Point 1: " + point1);
        System.out.println("Initial Point 2: " + point2);

        point1.moveUp();
        point2.moveLeft();

        System.out.println("After moving up Point 1: " + point1);
        System.out.println("After moving left Point 2: " + point2);

        System.out.println("Converting int to String: " + MovablePoint.convertToString(42));

        // Проверка скорости движения точек
        if (point1.speedTest(point2)) {
            System.out.println("Both points have the same speed.");
        } else {
            System.out.println("Points have different speeds.");
        }

        // Тестирование MovableRectangle
        System.out.println("\nTesting MovableRectangle:");
        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 6);

        System.out.println("Initial Rectangle: " + rectangle);

        rectangle.moveDown();
        rectangle.moveRight();

        System.out.println("After moving down and right: " + rectangle);

        System.out.println("Converting double to String: " + MovableRectangle.convertToString(3.14));

        // Проверка скорости движения точек прямоугольника
        if (rectangle.speedTest()) {
            System.out.println("Both points of the rectangle have the same speed.");
        } else {
            System.out.println("Points of the rectangle have different speeds.");
        }
    }
}
