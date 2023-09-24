package lab6._numbers1_5;

class MovableCircle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x - radius, y - radius, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x + radius, y + radius, xSpeed, ySpeed);
    }

    public boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
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

    @Override
    public String toString() {
        return "MovableCircle[" + topLeft + "," + bottomRight + "]";
    }
}
