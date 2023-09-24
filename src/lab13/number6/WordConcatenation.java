package lab13.number6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordConcatenation {
    public static void main(String[] args) {
        String fileName = "C:/Users/user/IdeaProjects/mireaLab/src/lab13/number6/123.txt"; // Укажите имя вашего файла

        try {
            List<String> words = readWordsFromFile(fileName);
            String concatenatedLine = getLine(words);
            System.out.println("Concatenated Line: " + concatenatedLine);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split(" ");
            for (String word : lineWords) {
                words.add(word);
            }
        }

        reader.close();
        return words;
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int wordCount = words.size();
        String currentWord = words.remove(random.nextInt(wordCount));
        result.append(currentWord);

        while (!words.isEmpty()) {
            char lastChar = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));
            boolean found = false;

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                char firstChar = Character.toLowerCase(word.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(word);
                    currentWord = word;
                    words.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        return result.toString();
    }
}