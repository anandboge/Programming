/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count7(717) → 2
count7(7) → 1
count7(123) → 0 */

public class Count7 {
    public static void main(String[] args) {
        System.out.println(count7(717));  // Output: 2
        System.out.println(count7(7));    // Output: 1
        System.out.println(count7(123));  // Output: 0
    }

    public static int count7(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Check if the last digit is 7
        int count = (n % 10 == 7) ? 1 : 0;
        // Recursively call count7 for the number without the last digit
        return count + count7(n / 10);
    }
}