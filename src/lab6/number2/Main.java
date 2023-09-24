package lab6.number2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 6, 2, 2);

        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println(rectangle);

        System.out.println("Has same speed: " + rectangle.hasSameSpeed());
    }
}