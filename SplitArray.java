/*Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are 
the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments 
you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true */

public class SplitArray {
    public static boolean splitArray(int[] nums) {
        return splitHelper(nums, 0, 0, 0);
    }

    private static boolean splitHelper(int[] nums, int index, int sum1, int sum2) {
        // If we have processed all elements, check if the sums are equal
        if (index == nums.length) {
            return sum1 == sum2;
        }

        // Include the current element in the first group (sum1)
        if (splitHelper(nums, index + 1, sum1 + nums[index], sum2)) {
            return true;
        }

        // Include the current element in the second group (sum2)
        if (splitHelper(nums, index + 1, sum1, sum2 + nums[index])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 2})); // true
        System.out.println(splitArray(new int[]{2, 3})); // false
        System.out.println(splitArray(new int[]{5, 2, 3})); // true
    }
}