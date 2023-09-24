package lab7.number7_8;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Magazine("National Geographic");
        printables[1] = new Book("Java Programming");
        printables[2] = new Magazine("Time");
        printables[3] = new Book("Design Patterns");

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}