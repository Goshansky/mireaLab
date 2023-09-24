package lab2.number1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("key", "lol@ya", 'm');
        author.getEmail();
        author.setEmail("jkjkjk");
        author.getName();
        author.getEmail();
        System.out.println(author.name);
        System.out.println(author.email);
    }
}
