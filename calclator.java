import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt for operator and numbers
            System.out.print("Enter an operator (+, -, *, /, %, or q to quit): ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                break;
            }

            System.out.print("Enter two numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            // Perform calculation based on operator
            double result = 0;
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
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        break;
                    }
                    result = num1 / num2;
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero");
                        break;
                    }
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operator");
            }

            // Print the result
            if (operator != '/' && operator != '%' && operator != 'q') {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
        }
    }
}
