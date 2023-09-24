package lab3.number2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            double x = random.nextDouble() * 10; // Случайная координата x
            double y = random.nextDouble() * 10; // Случайная координата y
            double radius = random.nextDouble() * 5; // Случайный радиус

            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        System.out.println("Все окружности:");
        tester.printCircles();

        Circle smallestCircle = tester.findSmallestCircle();
        Circle largestCircle = tester.findLargestCircle();

        System.out.println("Самая маленькая окружность:");
        System.out.println("Радиус: " + smallestCircle.getRadius());
        System.out.println("Длина окружности: " + smallestCircle.getCircumference());

        System.out.println("\nСамая большая окружность:");
        System.out.println("Радиус: " + largestCircle.getRadius());
        System.out.println("Длина окружности: " + largestCircle.getCircumference());

        tester.sortCirclesByRadius();
        System.out.println("\nОкружности после сортировки по радиусу:");
        tester.printCircles();
    }
}
