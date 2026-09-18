package Day01;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int originalNun = num;
        int revesed = 0;

        while (num != 0) {
            int digit = num % 10;   
            revesed = revesed * 10 + digit;
            num /= 10;
        }
        if (originalNun == revesed) {
            System.out.println(originalNun + " is a palindrome number.");
        } else {
            System.out.println(originalNun + " is not a palindrome number.");
        }
    }
    
}
