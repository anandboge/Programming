/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of 
the pair is that value. Return true if the given value is everywhere in the array.


isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false */

public class IsEverywhere {
    public static boolean isEverywhere(int[] array, int value) {
        // Iterate through the array from the first element to the second last element
        for (int i = 0; i < array.length - 1; i++) {
            // Check if neither of the adjacent elements is the given value
            if (array[i] != value && array[i + 1] != value) {
                return false; // If neither element is the value, return false
            }
        }
        return true; // If all pairs satisfy the condition, return true
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1)); // true
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 2)); // false
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1)); // false
    }
}