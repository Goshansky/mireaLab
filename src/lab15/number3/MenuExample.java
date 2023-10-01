package lab15.number3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample extends JFrame {
    private JTextArea textArea;

    public MenuExample() {
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание меню
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        JMenu helpMenu = new JMenu("Справка");

        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        JMenuItem aboutMenuItem = new JMenuItem("О программе");

        // Обработчики для пунктов меню
        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Добавьте здесь код для сохранения файла
                JOptionPane.showMessageDialog(null, "Файл сохранен", "Сохранение", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        cutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        pasteMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Программа с меню и кнопками", "О программе", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Добавление пунктов меню в меню "Файл"
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Добавление пунктов меню в меню "Правка"
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        // Добавление пункта меню в меню "Справка"
        helpMenu.add(aboutMenuItem);

        // Добавление меню в строку меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Создание текстового поля
        textArea = new JTextArea();
        textArea.setLineWrap(true);

        // Создание панели с кнопками
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Обработчики для кнопок
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Нажата кнопка 1\n");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Нажата кнопка 2\n");
            }
        });

        // Добавление компонентов на форму
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuExample();
            }
        });
    }
}
