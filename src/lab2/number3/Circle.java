package lab2.number3;

public class Circle {
    public int radius;
    public Point center;
    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
}
