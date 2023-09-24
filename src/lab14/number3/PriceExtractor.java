package lab14.number3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUB, 12.5 EU, 44 ERR, 0.004 EU.";

        // Регулярные выражения для поиска цен в USD, RUB и EU
        String usdRegex = "(\\d+\\.\\d+) USD";
        String rubRegex = "(\\d+) RUB";
        String euRegex = "(\\d+\\.\\d+) EU";

        Pattern usdPattern = Pattern.compile(usdRegex);
        Pattern rubPattern = Pattern.compile(rubRegex);
        Pattern euPattern = Pattern.compile(euRegex);

        Matcher usdMatcher = usdPattern.matcher(text);
        Matcher rubMatcher = rubPattern.matcher(text);
        Matcher euMatcher = euPattern.matcher(text);

        while (usdMatcher.find()) {
            String usdPrice = usdMatcher.group(1);
            System.out.println("Найдена цена в USD: " + usdPrice);
        }

        while (rubMatcher.find()) {
            String rubPrice = rubMatcher.group(1);
            System.out.println("Найдена цена в RUB: " + rubPrice);
        }

        while (euMatcher.find()) {
            String euPrice = euMatcher.group(1);
            System.out.println("Найдена цена в EU: " + euPrice);
        }
    }
}
