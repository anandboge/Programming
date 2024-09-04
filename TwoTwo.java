/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false */

public class TwoTwo {
    public static boolean twoTwo(int[] nums) {
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is 2
            if (nums[i] == 2) {
                // If the next element is not 2 and it's not the last element
                if (i + 1 >= nums.length || nums[i + 1] != 2) {
                    return false;
                }
                // Skip the next element because it's already checked
                i++;
            }
        }
        // If all 2's are next to each other
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(twoTwo(new int[]{4, 2, 2, 3})); // should return true
        System.out.println(twoTwo(new int[]{2, 2, 4}));    // should return true
        System.out.println(twoTwo(new int[]{2, 2, 4, 2})); // should return false
    }
}