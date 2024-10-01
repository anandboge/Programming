/*Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, 
so powerN(3, 2) is 9 (3 squared).


powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27 */

public class PowerN {
    // Recursive method to calculate base to the power of n
    public static int powerN(int base, int n) {
        // Base case: if n is 1, return base
        if (n == 1) {
            return base;
        }
        // Recursive case: base multiplied by base raised to the power of n-1
        return base * powerN(base, n - 1);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(powerN(3, 1)); // Output: 3
        System.out.println(powerN(3, 2)); // Output: 9
        System.out.println(powerN(3, 3)); // Output: 27
    }
}