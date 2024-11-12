/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given 
target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately 
following it in the array must not be chosen. (No loops needed.)


groupNoAdj(0, [2, 5, 10, 4], 12) → true
groupNoAdj(0, [2, 5, 10, 4], 14) → false
groupNoAdj(0, [2, 5, 10, 4], 7) → false */

public class GroupNoAdj{

    // Function to check if it's possible to find a subset that sums up to target
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        // Base case: if the target is 0, we have found a valid subset
        if (target == 0) {
            return true;
        }
        
        // If we've gone through all elements, return false
        if (start >= nums.length) {
            return false;
        }
        
        // Option 1: Include the current element (nums[start]) and skip the next element
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        
        // Option 2: Exclude the current element and move to the next one
        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 12)); // true
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 14)); // false
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));  // false
    }
}