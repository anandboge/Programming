/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to 
the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0] */

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {
        int[] arr1 = {0, 5, 0, 3};
        int[] arr2 = {0, 4, 0, 3};
        int[] arr3 = {0, 1, 0};
        
        System.out.println("Array 1: " + Arrays.toString(zeroMax(arr1)));
        System.out.println("Array 2: " + Arrays.toString(zeroMax(arr2)));
        System.out.println("Array 3: " + Arrays.toString(zeroMax(arr3)));
    }
    
    public static int[] zeroMax(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                int maxOdd = Integer.MIN_VALUE;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2!= 0 && arr[j] > maxOdd) {
                        maxOdd = arr[j];
                    }
                }
                result[i] = maxOdd;
            }
        }
        
        return result;
    }
}