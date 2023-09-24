package lab14.number9;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        String text = "This is a sample text to analyze letter frequencies. " +
                "It can be any text you want, and it should include both upper and lower case letters.";

        text = text.toLowerCase(); // Преобразование текста в нижний регистр для учета регистра букв

        int[] letterFrequency = new int[26]; // Массив для хранения частот букв

        // Проход по каждому символу в тексте
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { // Проверка, является ли символ буквой
                int index = c - 'a'; // Вычисление индекса буквы в алфавите
                letterFrequency[index]++; // Увеличение частоты буквы
            }
        }

        // Вывод частот букв
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + ": " + letterFrequency[i]);
        }
    }
}
