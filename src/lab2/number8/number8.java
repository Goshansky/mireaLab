package lab2.number8;

public class number8 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        int start = 0;
        int end = arr.length - 1;
        String temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}
