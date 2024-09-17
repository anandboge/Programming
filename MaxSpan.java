/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of 
elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. 
(Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6 */

public class MaxSpan {
    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxSpan = 1;

        for (int i = 0; i < nums.length; i++) {
            int firstIndex = -1;
            int lastIndex = -1;

            // Find the first and last appearance of nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    if (firstIndex == -1) {
                        firstIndex = j;
                    }
                    lastIndex = j;
                }
            }

            // Calculate the span
            int span = lastIndex - firstIndex + 1;
            maxSpan = Math.max(maxSpan, span);
        }

        return maxSpan;
    }

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3})); // Output: 4
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); // Output: 6
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4})); // Output: 6
    }
}