package lab12.number1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class RandomShapesApp extends JPanel {
    private final static int WINDOW_WIDTH = 800;
    private final static int WINDOW_HEIGHT = 600;
    private final static int NUM_SHAPES = 20;

    private final Random random = new Random();

    private Shape[] shapes;

    public RandomShapesApp() {
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapesApp app = new RandomShapesApp();
        frame.add(app);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
