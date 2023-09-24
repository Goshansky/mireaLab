package lab6.number6_7_8_9;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Java Programming");
        printableItems[1] = new Book("Design Patterns");
        printableItems[2] = new Shop("Bookstore");
        printableItems[3] = new Shop("Grocery Store");

        for (Printable item : printableItems) {
            item.print();
        }
    }
}