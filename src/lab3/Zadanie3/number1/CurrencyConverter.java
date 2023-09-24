package lab3.Zadanie3.number1;

public class CurrencyConverter {
    private double exchangeRateUSDToEUR;

    public CurrencyConverter(double exchangeRateUSDToEUR) {
        this.exchangeRateUSDToEUR = exchangeRateUSDToEUR;
    }

    // Метод для конвертации из долларов в евро
    public double convertUSDToEUR(double amountUSD) {
        return amountUSD * exchangeRateUSDToEUR;
    }

    // Метод для конвертации из евро в доллары
    public double convertEURToUSD(double amountEUR) {
        return amountEUR / exchangeRateUSDToEUR;
    }

    public void setExchangeRateUSDToEUR(double exchangeRateUSDToEUR) {
        this.exchangeRateUSDToEUR = exchangeRateUSDToEUR;
    }

    public double getExchangeRateUSDToEUR() {
        return exchangeRateUSDToEUR;
    }

    public static void main(String[] args) {
        // Создаем экземпляр конвертора с текущим курсом обмена
        CurrencyConverter converter = new CurrencyConverter(0.85);

        // Конвертируем сумму из долларов в евро
        double amountUSD = 100;
        double amountEUR = converter.convertUSDToEUR(amountUSD);
        System.out.println(amountUSD + " USD равно " + amountEUR + " EUR");

        // Конвертируем сумму из евро в доллары
        amountEUR = 85;
        amountUSD = converter.convertEURToUSD(amountEUR);
        System.out.println(amountEUR + " EUR равно " + amountUSD + " USD");
    }
}
