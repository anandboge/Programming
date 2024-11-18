/*Add Two Numbers
Your task is very simple: given two integers A and B, write a program to add these two numbers and output the sum. */

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter the first number (A): ");
        int A = scanner.nextInt();
        
        System.out.print("Enter the second number (B): ");
        int B = scanner.nextInt();
        
        // Add the two numbers
        int sum = A + B;
        
        // Output the result
        System.out.println("The sum of " + A + " and " + B + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}