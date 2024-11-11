/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that 
the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops 
needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false */

public class GroupSum6 { public static boolean groupSum6(int start, int[] nums, int target) {
    // Base case: If the target is 0, we've successfully found a valid group
    if (target == 0) {
        return true;
    }
    
    // If we've gone through all elements, no valid sum is possible
    if (start >= nums.length) {
        return false;
    }

    // If the current number is 6, we must include it in the sum
    if (nums[start] == 6) {
        return groupSum6(start + 1, nums, target - 6);
    }
    
    // Check both possibilities: including or excluding the current number
    return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
}

public static void main(String[] args) {
    System.out.println(groupSum6(0, new int[] {5, 6, 2}, 8)); // true
    System.out.println(groupSum6(0, new int[] {5, 6, 2}, 9)); // false
    System.out.println(groupSum6(0, new int[] {5, 6, 2}, 7)); // false
}
}