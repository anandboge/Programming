/*Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)


fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2] */

public class FizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        // Calculate the length of the array
        int length = end - start;
        
        // Create the array with the calculated length
        int[] result = new int[length];
        
        // Populate the array with values from start to end - 1
        for (int i = 0; i < length; i++) {
            result[i] = start + i;
        }
        
        // Return the populated array
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = fizzArray3(5, 10);
        int[] result2 = fizzArray3(11, 18);
        int[] result3 = fizzArray3(1, 3);

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // Output: [5, 6, 7, 8, 9]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [11, 12, 13, 14, 15, 16, 17]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1, 2]
    }
}