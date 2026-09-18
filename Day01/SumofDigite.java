import java.util.Scanner;

public class SumofDigite {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;

        while(num != 0){
            int digite = num % 10;
            sum = sum + digite;
            num = num /10;
        }
        System.out.println(sum);
    }
    
}
