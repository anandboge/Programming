/*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false */

public class TripleUp {
    public static boolean tripleUp(int[] nums) {
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if there are three consecutive increasing numbers
            if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2})); // should return true
        System.out.println(tripleUp(new int[]{1, 2, 3})); // should return true
        System.out.println(tripleUp(new int[]{1, 2, 4})); // should return false
    }
}