package lab3.Zadanie1;

public class Zadanie1 {
    public static void main(String[] args) {
        // 1. Создаем объекты класса Double с использованием методов valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 2. Преобразуем значение типа String в тип double с использованием parseDouble()
        String str = "1.618";
        double parsedDouble = Double.parseDouble(str);

        // 3. Преобразуем объект Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj2.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj2.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj2.byteValue();

        // 4. Выводим значение объекта Double на консоль
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);

        // 5. Преобразуем литерал типа double к строке с использованием Double.toString()
        String d = Double.toString(3.14);

        // Выводим результаты на консоль
        System.out.println("Преобразованное значение из строки: " + parsedDouble);
        System.out.println("Преобразование в примитивные типы:");
        System.out.println("double: " + primitiveDouble);
        System.out.println("float: " + primitiveFloat);
        System.out.println("int: " + primitiveInt);
        System.out.println("long: " + primitiveLong);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);
        System.out.println("Преобразованный литерал: " + d);
    }
}
