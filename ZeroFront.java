/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros 
are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes 
{0 ,0, 1, 1}. You may modify and return the given array or make a new array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1] */

import java.util.Arrays;

public class ZeroFront {

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1}))); // Output: [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1}))); // Output: [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0}))); // Output: [0, 1]
    }

    public static int[] zeroFront(int[] nums) {
        int zeroCount = 0;
        // Count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Create the result array
        int[] result = new int[nums.length];
        int index = 0;

        // Fill the result array with zeros
        for (int i = 0; i < zeroCount; i++) {
            result[index++] = 0;
        }

        // Fill the result array with non-zero numbers
        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}