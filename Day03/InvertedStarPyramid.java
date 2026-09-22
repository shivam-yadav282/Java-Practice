package Day03;

import java.util.Scanner;

public class InvertedStarPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
         int num = sc.nextInt();

         int i = 0;
         int j = 0;

         for(i = 1; i <= num; i++) {
             
            //space ke liye  
            for(j = 1; j<=i - 1; j++) {
                System.out.print(" ");
            }
            // star ke liye
            for(j = 1; j <= 2 * (num - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

         }
    }
           
}

    

