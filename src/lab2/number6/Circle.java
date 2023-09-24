package lab2.number6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateLenght() {
        return 2 * Math.PI * radius;
    }
    public boolean equals(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }
}
