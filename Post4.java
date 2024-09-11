/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after 
the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to 
create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3] */

import java.util.Arrays;

public class Post4 {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};
        
        System.out.println(Arrays.toString(post4(arr1))); // Output: [1, 2]
        System.out.println(Arrays.toString(post4(arr2))); // Output: [2]
        System.out.println(Arrays.toString(post4(arr3))); // Output: [1, 2, 3]
    }
    
    public static int[] post4(int[] nums) {
        int last4Index = -1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                last4Index = i;
                break;
            }
        }
        
        if (last4Index == -1) {
            return new int[0];
        }
        
        int[] result = new int[nums.length - 1 - last4Index];
        System.arraycopy(nums, last4Index + 1, result, 0, result.length);
        
        return result;
    }
}