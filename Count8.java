/*Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) 
by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */

 public class Count8 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(count8(8));    // Output: 1
        System.out.println(count8(818));  // Output: 2
        System.out.println(count8(8818)); // Output: 4
    }

    public static int count8(int n) {
        // Base case: if n is 0, there are no 8s left to count
        if (n == 0) {
            return 0;
        }

        // Get the rightmost digit
        int digit = n % 10;

        // Check if the digit is 8
        if (digit == 8) {
            // Check if the next digit (to the left) is also an 8
            if ((n / 10) % 10 == 8) {
                // If yes, count double
                return 2 + count8(n / 10); // Count double and recurse
            } else {
                // If no, count once
                return 1 + count8(n / 10); // Count once and recurse
            }
        } else {
            // If it's not an 8, just recurse
            return count8(n / 10);
        }
    }
 }