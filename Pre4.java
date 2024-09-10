/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before 
the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to 
create an array of length 0.


pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1] */

public class Pre4 {

    public static int[] pre4(int[] arr) {
        // Find the index of the first occurrence of 4
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
                break;
            }
        }

        // If 4 is found, create a new array with elements before the first 4
        if (index != -1) {
            int[] result = new int[index];
            for (int i = 0; i < index; i++) {
                result[i] = arr[i];
            }
            return result;
        }

        // Return an empty array if no 4 is found (shouldn't happen as per problem statement)
        return new int[0];
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = pre4(new int[]{1, 2, 4, 1});
        int[] result2 = pre4(new int[]{3, 1, 4});
        int[] result3 = pre4(new int[]{1, 4, 4});

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [3, 1]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1]
    }
}