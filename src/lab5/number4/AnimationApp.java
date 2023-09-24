package lab5.number4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationApp extends JFrame {
    private ImageIcon[] frames; // Массив изображений для анимации
    private JLabel animationLabel; // Компонент для отображения анимации
    private int currentFrame = 0; // Текущий кадр анимации

    public AnimationApp() {
        setTitle("Simple Animation");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Загрузка изображений анимации
        frames = new ImageIcon[4];
        for (int i = 0; i < 4; i++) {
            frames[i] = new ImageIcon("C:/Users/user/IdeaProjects/mireaLab/src/lab5/number4/frame" + (i + 1) + ".png");
        }

        animationLabel = new JLabel(frames[currentFrame]);
        add(animationLabel, BorderLayout.CENTER);

        // Создаем таймер для обновления анимации
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationApp app = new AnimationApp();
            app.setVisible(true);
        });
    }
}
