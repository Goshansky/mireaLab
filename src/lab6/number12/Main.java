package lab6.number12;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Hello, ");
        myStringBuilder.append("world!");

        System.out.println(myStringBuilder.toString());

        myStringBuilder.delete(7, 12);
        System.out.println(myStringBuilder.toString());

        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
    }
}
