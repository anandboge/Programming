/*Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple 
of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper 
method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). 
(No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true */

public class SplitOdd10 {
    // Main method that will call the helper function.
    public static boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(nums, 0, 0, 0);
    }

    // Recursive helper function
    private static boolean splitOdd10Helper(int[] nums, int index, int sumMultipleOf10, int sumOdd) {
        // Base case: If we've processed all numbers, check if the conditions are met
        if (index == nums.length) {
            return sumMultipleOf10 % 10 == 0 && sumOdd % 2 != 0;
        }

        // Get the current number
        int num = nums[index];

        // Try putting the current number in the group with sumMultipleOf10
        if (splitOdd10Helper(nums, index + 1, sumMultipleOf10 + num, sumOdd)) {
            return true;
        }

        // Try putting the current number in the group with sumOdd
        if (splitOdd10Helper(nums, index + 1, sumMultipleOf10, sumOdd + num)) {
            return true;
        }

        // If neither of the above calls returned true, return false
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(splitOdd10(new int[]{5, 5, 5})); // true
        System.out.println(splitOdd10(new int[]{5, 5, 6})); // false
        System.out.println(splitOdd10(new int[]{5, 5, 6, 1})); // true
    }
}