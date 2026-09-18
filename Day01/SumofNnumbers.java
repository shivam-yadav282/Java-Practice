package Day01;

import java.util.Scanner;

public class SumofNnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.err.println("Enter a number");
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + num + " natural numbers is: " + sum);
    }
    
}
