/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false */

public class HaveThree {
    public static boolean haveThree(int[] nums) {
        int count = 0; // To count the number of 3's
        boolean prevWasThree = false; // To keep track of the previous element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (prevWasThree) {
                    // If the previous element was 3, we found adjacent 3's
                    return false;
                }
                count++; // Increment the count of 3's
                prevWasThree = true; // Mark that the current element is 3
            } else {
                prevWasThree = false; // Reset the flag if the current element is not 3
            }
        }

        // Check if there were exactly 3 occurrences of 3
        return count == 3;
    }

    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3})); // true
        System.out.println(haveThree(new int[]{3, 1, 3, 3})); // false
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4})); // false
    }  
}