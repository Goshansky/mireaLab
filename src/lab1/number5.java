package lab1;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int k = scan.nextInt();
        long fk = new number5().fact(k);
        System.out.println("Ответ: " + fk);

    }

    public int fact(int l){
        int pr = 1;
        for (int i = 1; i<l+1; i++){
            pr*=i;
        }
        return pr;
    }
}
