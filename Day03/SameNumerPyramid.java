package Day03;

import java.util.Scanner;

public class SameNumerPyramid {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int i = 0;
        int j = 0;

        for(i = 1; i <= num; i++){
            // Space ke liye
            for(j = 1; j <=num - i; j++){
                System.out.print(" ");
            }
            // numbers ke liye 
            for(j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
