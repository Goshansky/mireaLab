package lab12.number2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DisplayImageApp extends JFrame {
    private BufferedImage image;

    public DisplayImageApp(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            setTitle("Display Image");
            setSize(image.getWidth(), image.getHeight());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Чтобы окно было по центру экрана
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Usage: java DisplayImageApp <image_path>");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            lab5.number3.DisplayImageApp app = new lab5.number3.DisplayImageApp("C:/Users/user/IdeaProjects/mireaLab/src/lab12/number2/Screenshot_1.png");
            app.setVisible(true);
        });
    }
}

