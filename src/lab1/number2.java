package lab1;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int k = scan.nextInt();
        int[] a = new int[k];
        int sm = 0;
        for (int i = 0; i<k; i++){
            a[i] = scan.nextInt();
        }
        int mn = a[k-1];
        int mx = a[k-1];

        while(k>0){
            sm+=a[k-1];
            if (mn>a[k-1]){
                mn = a[k-1];
            }
            if (mx<a[k-1]){
                mx = a[k-1];
            }
            k--;

        }
        System.out.println("Сумма элементов: "+sm);
        System.out.println("Максимальное значение: "+mx);
        System.out.println("Минимальное значение: "+mn);


    }
}
