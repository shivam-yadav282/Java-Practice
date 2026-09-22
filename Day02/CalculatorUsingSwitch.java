import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                sc.close();
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        sc.close();
    }
    
}
