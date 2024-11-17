/*Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the 
same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are 
a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true */

public class Split53 {
    public static boolean split53(int[] nums) {
        return canSplit(nums, 0, 0, 0);
    }

    // Helper method to recursively check the division of the array
    private static boolean canSplit(int[] nums, int index, int group1Sum, int group2Sum) {
        // Base case: if we've checked all numbers
        if (index == nums.length) {
            return group1Sum == group2Sum;
        }

        int num = nums[index];

        // If the number is a multiple of 5, it must go into group1
        if (num % 5 == 0) {
            return canSplit(nums, index + 1, group1Sum + num, group2Sum);
        }

        // If the number is a multiple of 3 (and not a multiple of 5), it must go into group2
        if (num % 3 == 0) {
            return canSplit(nums, index + 1, group1Sum, group2Sum + num);
        }

        // Otherwise, we can choose to put the number in either group
        return canSplit(nums, index + 1, group1Sum + num, group2Sum) ||
               canSplit(nums, index + 1, group1Sum, group2Sum + num);
    }

    public static void main(String[] args) {
        System.out.println(split53(new int[]{1, 1})); // true
        System.out.println(split53(new int[]{1, 1, 1})); // false
        System.out.println(split53(new int[]{2, 4, 2})); // true
    }
}