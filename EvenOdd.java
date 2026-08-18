import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //int number = 10; // You can change this number to test with different values
        Scanner sc = new
        Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    
}
