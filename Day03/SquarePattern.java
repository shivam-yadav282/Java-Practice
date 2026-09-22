package Day03;
import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr a number");
        int num = sc.nextInt();

        int i = 0;
        int j = 0;

        for(i = 1; i<=num ; i++){
            for(j = 1; j <= num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
