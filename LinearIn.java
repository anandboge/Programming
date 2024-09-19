/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear 
in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both \
arrays are already in sorted order.


linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true */

public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        // Loop through both arrays until we reach the end of either
        while (outerIndex < outer.length && innerIndex < inner.length) {
            // If the current element in inner is found in outer
            if (inner[innerIndex] == outer[outerIndex]) {
                innerIndex++; // Move to the next element in inner
            }
            outerIndex++; // Always move to the next element in outer
        }

        // If we've checked all elements in inner, return true
        return innerIndex == inner.length;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})); // true
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // false
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4})); // true
    }
}