package Day03;

import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        // Upper half
        for (int i = 1; i <= num; i++) {

            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = num - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}