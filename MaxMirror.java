/*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, 
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is 
length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.


maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2 */

public class MaxMirror {
    public static int maxMirror(int[] arr) {
        int n = arr.length;
        int maxLength = 0;

        // Check for every possible starting point in the array
        for (int i = 0; i < n; i++) {
            // Check for every possible starting point in the reversed array
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;

                // Count the mirror length while within bounds
                while (i + length < n && j - length >= 0 && arr[i + length] == arr[j - length]) {
                    length++;
                }

                // Update maxLength if we found a longer mirror
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})); // → 3
        System.out.println(maxMirror(new int[]{1, 2, 1, 4})); // → 3
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1})); // → 2
    }
}