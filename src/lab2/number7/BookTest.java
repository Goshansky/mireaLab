package lab2.number7;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book("Книга 1", "Автор 1", 2000);
        Book book2 = new Book("Книга 2", "Автор 2", 1990);
        Book book3 = new Book("Книга 3", "Автор 3", 2010);

        BookShelf bookShelf = new BookShelf(3);
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);

        System.out.println(bookShelf);

        Book latestBook = bookShelf.getLatestBook();
        Book oldestBook = bookShelf.getOldestBook();

        System.out.println("Самая поздняя книга: " + latestBook);
        System.out.println("Самая ранняя книга: " + oldestBook);

        bookShelf.sortBooksByYear();
        System.out.println("Книги после сортировки по году выпуска:");
        System.out.println(bookShelf);
    }
}
