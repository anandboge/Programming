/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8 */

public class BigDiff {

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6})); // 7
        System.out.println(bigDiff(new int[]{7, 2, 10, 9})); // 8
        System.out.println(bigDiff(new int[]{2, 10, 7, 2})); // 8
    }
    
    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            
            if (num > max) {
                max = num;
            }
        }
        
        return max - min;
    }
}