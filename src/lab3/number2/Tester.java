package lab3.number2;
import java.util.Arrays;
public class Tester {
    private Circle[] circles;
    private int size;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        size = 0;
    }

    public void addCircle(Circle circle) {
        if (size < circles.length) {
            circles[size++] = circle;
        } else {
            System.out.println("Массив окружностей заполнен.");
        }
    }

    public Circle findSmallestCircle() {
        if (size == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (size == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, size, (circle1, circle2) -> Double.compare(circle1.getRadius(), circle2.getRadius()));
    }

    public void printCircles() {
        for (int i = 0; i < size; i++) {
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println("Длина окружности: " + circles[i].getCircumference());
            System.out.println();
        }
    }
}

