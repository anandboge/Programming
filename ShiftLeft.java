/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1] */

public class ShiftLeft {
    public static int[] shiftLeft(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        // Create a new array of the same length
        int[] shiftedArr = new int[arr.length];
        
        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            shiftedArr[i] = arr[i + 1];
        }
        
        // Move the first element to the end of the new array
        shiftedArr[arr.length - 1] = arr[0];
        
        return shiftedArr;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = shiftLeft(new int[] {6, 2, 5, 3});
        int[] result2 = shiftLeft(new int[] {1, 2});
        int[] result3 = shiftLeft(new int[] {1});
        
        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // Output: [2, 5, 3, 6]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [2, 1]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1]
    }
}