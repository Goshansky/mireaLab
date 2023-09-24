package lab5.number2;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapesApp app = new RandomShapesApp();
            app.setVisible(true);
        });
    }
}
