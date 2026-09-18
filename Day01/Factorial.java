package Day01;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
    
}

// Number chahiye
//        ↓
// num me store karo
//        ↓
// Answer ke liye fact = 1
//        ↓
// 1 se num tak loop
//        ↓
// Har baar fact ko i se multiply
//        ↓
// fact print karo