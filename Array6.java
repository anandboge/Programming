/*Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering 
only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move 
down the array. The initial call will pass in index as 0.


array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true */

public class Array6 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 4};
        System.out.println(array6(arr, 0)); // true
        
        int[] arr2 = {1, 4};
        System.out.println(array6(arr2, 0)); // false
        
        int[] arr3 = {6};
        System.out.println(array6(arr3, 0)); // true
    }
    
    public static boolean array6(int[] nums, int index) {
        // Base case: if index is out of bounds, return false
        if (index >= nums.length) {
            return false;
        }
        
        // Recursive case: if current element is 6, return true
        if (nums[index] == 6) {
            return true;
        }
        
        // Recursive case: continue searching in the rest of the array
        return array6(nums, index + 1);
    }
}