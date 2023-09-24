package lab4_1.number9;

public class Main {
    public static void main(String[] args) {
        // Создаем разные виды мебели
        Furniture chair = new Chair("Стул для офиса", 50.0, 4);
        Furniture table = new Table("Обеденный стол", 150.0, 90);
        Furniture sofa = new Sofa("Диван угловой", 300.0, "ткань");

        // Создаем массив мебели
        Furniture[] stock = {chair, table, sofa};

        // Создаем магазин мебели
        FurnitureShop shop = new FurnitureShop(stock);

        // Выводим информацию о доступной мебели
        shop.showStock();
    }
}
