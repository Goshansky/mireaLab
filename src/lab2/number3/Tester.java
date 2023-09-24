package lab2.number3;

import lab2.number2.Ball;

public class Tester {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(-2, 1);

        Circle circle1 = new Circle(point1, 5);
        Circle circle2 = new Circle(point2, 3);

        Circle[] circles = {circle1, circle2};

        System.out.println("Первая окружность:");
        System.out.println("Центр: (" + circle1.getCenter().x+","+circle1.getCenter().y+")");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println();

        System.out.println("Вторая окружность:");
        System.out.println("Центр: (" +circle2.getCenter().x+","+circle2.getCenter().y+ ")");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println();

        System.out.println("Количество окружностей: " + circles.length);
    }
}
