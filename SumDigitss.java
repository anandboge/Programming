/*Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields 
the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3 */

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(126)); // Output: 9
        System.out.println(sumDigits(49));  // Output: 13
        System.out.println(sumDigits(12));  // Output: 3
    }

    public static int sumDigits(int n) {
        // Base case: if n is 0, the sum of digits is 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: add the rightmost digit to the sum of the remaining digits
        return (n % 10) + sumDigits(n / 10);
    }
}