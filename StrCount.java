/*Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.


strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0 */

public class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat")); // Output: 2
        System.out.println(strCount("catcowcat", "cow")); // Output: 1
        System.out.println(strCount("catcowcat", "dog")); // Output: 0
    }

    public static int strCount(String str, String sub) {
        // Base case: if the string length is less than the substring length, return 0
        if (str.length() < sub.length()) {
            return 0;
        }
        
        // If the beginning of the string matches the substring, count it and skip over it
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            // Otherwise, continue searching in the string from the next character
            return strCount(str.substring(1), sub);
        }
    }
}