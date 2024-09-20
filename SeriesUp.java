/*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, 
which is known to sum to exactly n*(n + 1)/2.


seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 */

public class SeriesUp {
    public static int[] seriesUp(int n) {
        // Calculate the size of the resulting array
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        
        int index = 0;
        for (int i = 1; i <= n; i++) {
            // For each i, fill the values from 1 to i
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = seriesUp(3);
        int[] result2 = seriesUp(4);
        int[] result3 = seriesUp(2);

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // [1, 1, 2, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(result2)); // [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(java.util.Arrays.toString(result3)); // [1, 1, 2]
    }
}
