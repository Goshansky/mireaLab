package lab2.number2;

import lab2.number1.Author;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(12.5, 78.90);
        System.out.println(ball.getX()+" "+ball.getY());
        ball.setXY(5, 6);
        System.out.println(ball.getX()+" "+ball.getY());
    }
}
