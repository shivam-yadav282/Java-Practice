package Day01;
import java.util.Scanner;

public class MaximumofTwoNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number");
        int num1 = sc.nextInt();

        System.out.println("Second Number");
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);

        
        System.out.println("Maximum of two numbers is: " + max);
    }

    
}
