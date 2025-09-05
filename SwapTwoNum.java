// Java program to swap two numbers without using third variable

public class SwapTwoNum {
    public static void main(String[] args) {    // Main method
        int a = 10, b = 20;    // Initialize two variables to be swapped
        System.out.println("Before swapping: a = " + a + ", b = " + b);    // Print values before swapping
        a = a + b;    // Step 1: Add both numbers and store in 'a'
        b = a - b;    // Step 2: Subtract new 'b' from 'a' to get original 'a'
        a = a - b;    // Step 3: Subtract new 'b' from new 'a' to get original 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);    // Print values after swapping
    }
    // The above code swaps two numbers without using a third variable.
}


// using temporary variable

// public class SwapTwoNum {
//     public static void main(String[] args) {    // Main method
//         int a = 10, b = 20;    // Initialize two variables to be swapped
//         System.out.println("Before swapping: a = " + a + ", b = " + b);    // Print values before swapping
//         int temp = a;    // Store the value of 'a' in a temporary variable
//         a = b;    // Assign the value of 'b' to 'a'
//         b = temp;    // Assign the value of 'temp' (original 'a') to 'b'
//         System.out.println("After swapping: a = " + a + ", b = " + b);    // Print values after swapping
//     }
// }


// Using bitwise XOR operator

// XOR is a bitwise operation that compares the binary representation of two numbers.
// It returns 1 if the bits are different and 0 if the bits are the same.

// public class SwapTwoNum {
//     public static void main(String[] args) {    // Main method
//         int a = 10, b = 20;    // Initialize two variables to be swapped
//         System.out.println("Before swapping: a = " + a + ", b = " + b);    // Print values before swapping
//         a = a ^ b;    // 1010 ^ 10100 = 11110 (which is 30 in decimal).
//         b = a ^ b;    // 11110 ^ 10100 = 1010 (which is 10 in decimal).
//         a = a ^ b;    // 11110 ^ 1010 = 10100 (which is 20 in decimal).
//         System.out.println("After swapping: a = " + a + ", b = " + b);    // Print values after swapping
//     }
// }


// using multiplication and division
// public class SwapTwoNum {
//     public static void main(String[] args) {    // Main method
//         int a = 10, b = 20;    // Initialize two variables to be swapped
//         System.out.println("Before swapping: a = " + a + ", b = " + b);    // Print values before swapping
//         a = a * b;    // Step 1: Multiply both numbers and store in 'a'
//         b = a / b;    // Step 2: Divide new 'a' by 'b' to get original 'a'
//         a = a / b;    // Step 3: Divide new 'a' by new 'b' to get original 'b'
//         System.out.println("After swapping: a = " + a + ", b = " + b);    // Print values after swapping
//     }
// }


// using a method
// public class SwapTwoNum {
//     public static void main(String[] args) {    // Main method
//         int a = 10, b = 20;    // Initialize two variables to be swapped 
//         System.out.println("Before swapping: a = " + a + ", b = " + b);    // Print values before swapping
//         swap(a, b);    // Call the swap method to swap the values
//     }    // End of main method

//     public static void swap(int a, int b) {    // Method to swap two numbers
//         int temp = a;    // Store the value of 'a' in a temporary variable
//         a = b;    // Assign the value of 'b' to 'a'
//         b = temp;    // Assign the value of 'temp' (original 'a') to 'b'
//         System.out.println("After swapping: a = " + a + ", b = " + b);    // Print values after swapping
//     }    // End of swap method
// }    // End of SwapTwoNum class