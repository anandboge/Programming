/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, 
so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6 */

public class Sum13 {

    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1})); // Output: 6
        System.out.println(sum13(new int[]{1, 1})); // Output: 2
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13})); // Output: 6
    }
    
    public static int sum13(int[] nums) {
        int sum = 0;
        boolean is13 = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                is13 = true;
            } else if (!is13) {
                sum += nums[i];
            }
            is13 = false;
        }
        
        return sum;
    }
}