/*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of 
clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1 */

public class CountClumps {
    public static int countClumps(int[] arr) {
        if (arr.length == 0) {
            return 0; // No elements in the array
        }

        int clumpCount = 0;
        boolean inClump = false; // To track if we are currently in a clump

        for (int i = 0; i < arr.length; i++) {
            // Check if current element is the same as the next one
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                if (!inClump) {
                    clumpCount++; // Found a new clump
                    inClump = true; // We are in a clump
                }
            } else {
                inClump = false; // End of clump
            }
        }

        return clumpCount;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4})); // Output: 2
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1})); // Output: 2
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1})); // Output: 1
        System.out.println(countClumps(new int[]{})); // Output: 0
    }
}