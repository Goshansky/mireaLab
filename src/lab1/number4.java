package lab1;

import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int[] a = new int[10];
        for (int i = 0; i<10; i++){
            double k = 1.0/(i+1);
            System.out.printf("Число %d: %.3f", i+1, k);
            System.out.println();
        }

    }
}
