/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given 
target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value 
immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)


groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false */

public class GroupSum5 {

    public static boolean groupSum5(int start, int[] nums, int target) {
        // Base case: If we have reached the end of the array
        if (start >= nums.length) {
            return target == 0;  // Check if target has been reduced to 0
        }
        
        // If the current number is a multiple of 5, it must be included
        if (nums[start] % 5 == 0) {
            // Check if the number after it is 1, if so, skip the next number
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]); // Skip the next number
            }
            return groupSum5(start + 1, nums, target - nums[start]); // Include this number
        }
        
        // If the current number is not a multiple of 5, we have two choices:
        return groupSum5(start + 1, nums, target - nums[start]) ||  // Include this number
               groupSum5(start + 1, nums, target);  // Skip this number
    }

    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 19));  // true
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 17));  // true
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 12));  // false
    }
}