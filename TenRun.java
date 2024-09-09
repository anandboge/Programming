/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20] */

public class TenRun {
    public static int[] tenRun(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        // Variable to keep track of the current multiple of 10
        int currentMultipleOfTen = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                // Update the current multiple of 10
                currentMultipleOfTen = arr[i];
            }
            
            // If there is a current multiple of 10, update the element
            if (currentMultipleOfTen != -1) {
                arr[i] = currentMultipleOfTen;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = tenRun(new int[] {2, 10, 3, 4, 20, 5});
        int[] result2 = tenRun(new int[] {10, 1, 20, 2});
        int[] result3 = tenRun(new int[] {10, 1, 9, 20});
        
        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // Output: [2, 10, 10, 10, 20, 20]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [10, 10, 20, 20]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [10, 10, 10, 20]
    }
}