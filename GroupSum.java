/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given 
target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in 
this problem, you can use the same pattern for many problems to search a space of choices. Rather than looking at the 
whole array, our convention is to consider the part of the array starting at index start and continuing to the end of 
the array. The caller can specify the whole array simply by passing start as 0. No loops are needed -- 
the recursive calls progress down the array.


groupSum(0, [2, 4, 8], 10) → true
groupSum(0, [2, 4, 8], 14) → true
groupSum(0, [2, 4, 8], 9) → false */

public class GroupSum {
    public static void main(String[] args) {
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));  // true
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 14));  // true
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 9));   // false
    }

    public static boolean groupSum(int start, int[] nums, int target) {
        // Base case: if the target is 0, we've found a valid group
        if (target == 0) {
            return true;
        }
        
        // Base case: if we've considered all elements, return false
        if (start >= nums.length) {
            return false;
        }
        
        // Include the current element and recursively try to find the target sum
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        
        // Exclude the current element and recursively try to find the target sum
        if (groupSum(start + 1, nums, target)) {
            return true;
        }
        
        // If no solution is found, return false
        return false;
    }
}