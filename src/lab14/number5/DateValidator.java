package lab14.number5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    public static void main(String[] args) {
        String[] dates = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899"
        };

        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";

        Pattern pattern = Pattern.compile(regex);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " - Правильная дата");
            } else {
                System.out.println(date + " - Неправильная дата");
            }
        }
    }
}
