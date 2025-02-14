/*Write a program that acts as a calculator as in the previous lessons, but now it will get input from the user until he enters e.

The calculation will be in the format operation, float, float (separated by a new line), where the possible operations are +,-,*,/.

Each output (calculation result) is separated by a new line.

Check the test cases for examples.

To get input for a char use,

char c = scanner.nextLine().charAt(0);
You might need to skip a line so you can use just scanner.nextLine() */

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            char op = scanner.nextLine().charAt(0);
            if (op == 'e') {
                break;
            }
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double result = 0;
            switch (op) {
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
                    result = num1 / num2;
                    break;
            }
            System.out.println(result);
        }
        scanner.close();
    }    
}




/*import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Read the operation from user input
            System.out.println("Enter operation (+, -, *, /) or 'e' to exit:");
            char operation = scanner.nextLine().charAt(0);

            // If the user inputs 'e', exit the loop
            if (operation == 'e') {
                break;
            }

            // Read two float numbers
            System.out.println("Enter first number:");
            float num1 = Float.parseFloat(scanner.nextLine());

            System.out.println("Enter second number:");
            float num2 = Float.parseFloat(scanner.nextLine());

            // Perform calculation based on the operation
            float result = 0;
            switch (operation) {
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
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation");
                    continue;
            }

            // Output the result of the operation
            System.out.println("Result: " + result);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
        System.out.println("Calculator exited.");
    }
}
 */