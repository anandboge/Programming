// Java Program to Display All Prime Numbers from 1 to N

import java.util.Scanner;

public class PrimeNumber1_N {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a value for N
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        // Display all prime numbers from 1 to N
        System.out.println("Prime numbers from 1 to " + N + " are:");
        
        // Loop through all numbers from 2 to N
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            
            // Check if num is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
