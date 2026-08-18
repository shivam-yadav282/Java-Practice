import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        //int a = -1; // You can change this number to test with different values

        Scanner sc = new 
        Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
           if(number>0){
            System.out.println("The number is positive");
           }
            else if(number<0){
               System.out.println("The number is Negative");
           }
           else{
            System.out.println("The number is Zero");
           }
           } 


    
}
