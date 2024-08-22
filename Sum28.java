/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false */

public class Sum28 {
    public static boolean sum28(int[] nums) {
        int sum = 0;
        
        // Iterate over the array to find all occurrences of 2
        for (int num : nums) {
            if (num == 2) {
                sum += num; // Add 2 to sum
            }
        }
        
        // Check if the sum of all 2's is exactly 8
        return sum == 8;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2})); // → true
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2})); // → false
        System.out.println(sum28(new int[]{1, 2, 3, 4})); // → false
    }
}