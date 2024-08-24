/*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement 
for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
The syntax to make a new int array is: new int[desired_length]   


fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] */

public class FizzArray {
    public static int[] fizzArray(int n) {
        int[] result = new int[n];  // Create an array of length n
        for (int i = 0; i < n; i++) {
            result[i] = i;  // Fill the array with values from 0 to n-1
        }
        return result;  // Return the filled array
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] array1 = fizzArray(4);
        int[] array2 = fizzArray(1);
        int[] array3 = fizzArray(10);

        // Print the arrays to verify the results
        System.out.println(java.util.Arrays.toString(array1)); // Output: [0, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(array2)); // Output: [0]
        System.out.println(java.util.Arrays.toString(array3)); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}