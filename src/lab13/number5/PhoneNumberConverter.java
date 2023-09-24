package lab13.number5;

public class PhoneNumberConverter {
    public static String convertToFormatted(String phoneNumber) {
        // Убираем все пробелы и символы "-" из строки
        phoneNumber = phoneNumber.replaceAll("[\\s-]", "");

        // Проверяем, в каком формате передан номер
        if (phoneNumber.startsWith("+")) {
            // Формат +<Код страны><Номер 10 цифр>
            if (phoneNumber.length() == 12) {
                String countryCode = phoneNumber.substring(1, 4);
                String numberPart = phoneNumber.substring(4);

                return "+" + countryCode + "-" + numberPart.substring(0, 3) + "-" + numberPart.substring(3, 6) + "-" + numberPart.substring(6);
            }
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
            // Формат 8<Номер 10 цифр> для России
            String numberPart = phoneNumber.substring(1);

            return "+7" + "-" + numberPart.substring(0, 3) + "-" + numberPart.substring(3, 6) + "-" + numberPart.substring(6);
        }

        // Если формат не распознан, возвращаем исходную строку
        return phoneNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String formattedPhoneNumber1 = PhoneNumberConverter.convertToFormatted(phoneNumber1);
        String formattedPhoneNumber2 = PhoneNumberConverter.convertToFormatted(phoneNumber2);
        String formattedPhoneNumber3 = PhoneNumberConverter.convertToFormatted(phoneNumber3);

        System.out.println("Formatted Phone Number 1: " + formattedPhoneNumber1);
        System.out.println("Formatted Phone Number 2: " + formattedPhoneNumber2);
        System.out.println("Formatted Phone Number 3: " + formattedPhoneNumber3);
    }
}
