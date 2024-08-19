/*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 
and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4 */

public class Sum67 {

    public static int sum67(int[] nums) {
        int totalSum = 0;
        boolean ignoreSection = false;

        for (int num : nums) {
            if (num == 6) {
                ignoreSection = true;
            } else if (num == 7 && ignoreSection) {
                ignoreSection = false;
            } else if (!ignoreSection) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {1, 2, 2, 6, 99, 99, 7};
        int[] nums3 = {1, 1, 6, 7, 2};

        System.out.println(sum67(nums1)); // Output: 5
        System.out.println(sum67(nums2)); // Output: 5
        System.out.println(sum67(nums3)); // Output: 4
    }
}
