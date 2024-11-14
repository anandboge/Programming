/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given 
target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, 
they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all 
three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).


groupSumClump(0, [2, 4, 8], 10) → true
groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
groupSumClump(0, [2, 4, 4, 8], 14) → false */

public class GroupSumClump {
    public static boolean groupSumClump(int start, int[] nums, int target) {
        // Base case: If we've reached the end of the array, check if target is 0
        if (start >= nums.length) {
            return target == 0;
        }

        // Identify the clump of adjacent identical values
        int current = nums[start];
        int end = start;
        
        // Find the extent of the clump of identical values
        while (end < nums.length && nums[end] == current) {
            end++;
        }
        
        // Calculate the sum of the clump
        int clumpSum = current * (end - start);

        // Try two possibilities: including the clump or excluding it
        // 1. Include the clump
        if (groupSumClump(end, nums, target - clumpSum)) {
            return true;
        }
        
        // 2. Exclude the clump
        if (groupSumClump(end, nums, target)) {
            return true;
        }

        // If neither choice works, return false
        return false;
    }

    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{2, 4, 8}, 10)); // true
        System.out.println(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14)); // true
        System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8}, 14)); // false
    }
}