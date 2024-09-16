/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {
public static int[] evenOdd(int[] array) {
        // Lists to store even and odd numbers
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        // Separate even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        // Merge the lists
        int[] result = new int[array.length];
        int index = 0;

        // Add even numbers to the result array
        for (int num : evens) {
            result[index++] = num;
        }

        // Add odd numbers to the result array
        for (int num : odds) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 0, 1, 0, 0, 1, 1};
        int[] test2 = {3, 3, 2};
        int[] test3 = {2, 2, 2};

        System.out.println(Arrays.toString(evenOdd(test1))); // [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(test2))); // [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(test3))); // [2, 2, 2]
    }
}