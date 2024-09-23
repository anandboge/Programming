/*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


factorial(1) → 1
factorial(2) → 2
factorial(3) → 6 */

public class Factorial {public static void main(String[] args) {
    // Test the factorial function
    System.out.println(factorial(1)); // Output: 1
    System.out.println(factorial(2)); // Output: 2
    System.out.println(factorial(3)); // Output: 6
}

// Recursive method to calculate factorial
public static int factorial(int n) {
    // Base case: factorial of 1 is 1
    if (n == 1) {
        return 1;
    }
    // Recursive case: n * factorial of (n - 1)
    return n * factorial(n - 1);
}
}