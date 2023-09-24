package lab1;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int k = scan.nextInt();
        int[] a = new int[k];
        int sm = 0;
        for (int i = 0; i<k; i++){
            a[i] = scan.nextInt();
            sm+=a[i];
        }
        System.out.println("Сумма элементов: "+sm);
        System.out.println("Среднее арифметическое: "+(sm/k));


    }

}
