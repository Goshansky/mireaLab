package lab2.number6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        System.out.println("Радиус окружности 1: " + circle1.getRadius());
        System.out.println("Радиус окружности 2: " + circle2.getRadius());

        System.out.println("Площадь окружности 1: " + circle1.calculateArea());
        System.out.println("Площадь окружности 2: " + circle2.calculateArea());
        System.out.println("Длина окружности 1: " + circle1.calculateLenght());
        System.out.println("Длина окружности 2: " + circle2.calculateLenght());

        if (circle1.equals(circle2)) {
            System.out.println("Окружности имеют одинаковый радиус.");
        } else {
            System.out.println("Окружности имеют разный радиус.");
        }
    }
}
