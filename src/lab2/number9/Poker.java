package lab2.number9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Буби", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        Collections.shuffle(deck);

        int cardsPlayer = 5;
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < cardsPlayer; j++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println();
        }

        if (!deck.isEmpty()) {
            System.out.println("Остаток колоды:");
            for (String card : deck) {
                System.out.println(card);
            }
        }
    }
}
