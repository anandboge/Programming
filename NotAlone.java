/*We'll say that an element in an array is "alone" if there are values before and after it, and those values are 
different from it. Return a version of the given array where every instance of the given value which is alone is 
replaced by whichever value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4] */

public class NotAlone {
    public static int[] notAlone(int[] arr, int val) {
        // If the array has less than 3 elements, return it as is
        if (arr.length < 3) {
            return arr;
        }

        // Copy the original array to modify it
        int[] result = arr.clone();

        // Iterate through the array, starting from the second element to the second-to-last element
        for (int i = 1; i < arr.length - 1; i++) {
            // Check if the current element is the value to be replaced and is alone
            if (arr[i] == val && arr[i - 1] != val && arr[i + 1] != val) {
                // Replace with the maximum of the left and right neighbors
                result[i] = Math.max(arr[i - 1], arr[i + 1]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 2, 3, 2, 5, 2};
        int[] test3 = {3, 4};

        // Applying the notAlone method and printing results
        printArray(notAlone(test1, 2)); // Output: [1, 3, 3]
        printArray(notAlone(test2, 2)); // Output: [1, 3, 3, 5, 5, 2]
        printArray(notAlone(test3, 3)); // Output: [3, 4]
    }

    // Helper method to print arrays
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}