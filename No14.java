/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true */

public class No14 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(no14(new int[]{1, 2, 3}));  // true
        System.out.println(no14(new int[]{1, 2, 3, 4}));  // false
        System.out.println(no14(new int[]{2, 3, 4}));  // true
    }

    public static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;

        // Check if the array contains 1 or 4
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 4) {
                hasFour = true;
            }
        }

        // Return true if it contains neither 1 nor 4, or contains only one of them
        return !(hasOne && hasFour);
    }
}