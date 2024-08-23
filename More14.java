/*Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true */

public class More14 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(more14(new int[]{1, 4, 1})); // true
        System.out.println(more14(new int[]{1, 4, 1, 4})); // false
        System.out.println(more14(new int[]{1, 1})); // true
    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        
        // Count the number of 1's and 4's in the array
        for (int num : nums) {
            if (num == 1) {
                count1++;
            } else if (num == 4) {
                count4++;
            }
        }
        
        // Return true if the number of 1's is greater than the number of 4's
        return count1 > count4;
    }
}