/*Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true */

public class StrCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2)); // true
        System.out.println(strCopies("catcowcat", "cow", 2)); // false
        System.out.println(strCopies("catcowcat", "cow", 1)); // true
    }

    public static boolean strCopies(String str, String sub, int n) {
        // Base case: if n is 0, we've found enough occurrences
        if (n == 0) {
            return true;
        }

        // Base case: if the string is shorter than the substring, we can't find more occurrences
        if (str.length() < sub.length()) {
            return false;
        }

        // If the substring matches the start of the string
        if (str.startsWith(sub)) {
            // Recursively check for the rest of the string, decreasing n
            return strCopies(str.substring(1), sub, n - 1);
        }

        // Otherwise, move one character forward and check again
        return strCopies(str.substring(1), sub, n);
    }
}