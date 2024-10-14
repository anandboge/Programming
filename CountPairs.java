/*We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. 
Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.


countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1 */

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));    // Output: 1
        System.out.println(countPairs("axax"));   // Output: 2
        System.out.println(countPairs("axbx"));   // Output: 1
    }

    public static int countPairs(String s) {
        // Base case: if the length of the string is less than 3
        if (s.length() < 3) {
            return 0;
        }

        // Check for a pair: characters at index 0 and 2
        if (s.charAt(0) == s.charAt(2)) {
            // Found a pair, count it and continue searching in the rest of the string
            return 1 + countPairs(s.substring(1));
        } else {
            // No pair found, just continue searching in the rest of the string
            return countPairs(s.substring(1));
        }
    }
}