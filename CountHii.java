/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1 */

public class CountHi {

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx")); // Output: 1
        System.out.println(countHi("xhixhix")); // Output: 2
        System.out.println(countHi("hi"));      // Output: 1
        System.out.println(countHi("hihih"));   // Output: 2
        System.out.println(countHi("abc"));     // Output: 0
    }

    public static int countHi(String str) {
        // Base case: If the string is too short to contain "hi"
        if (str.length() < 2) {
            return 0;
        }
        
        // Check if the first two characters are "hi"
        if (str.startsWith("hi")) {
            // If "hi" is found, count it and move 2 characters ahead
            return 1 + countHi(str.substring(2));
        } else {
            // Otherwise, move 1 character ahead
            return countHi(str.substring(1));
        }
    }
}