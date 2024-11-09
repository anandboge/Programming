/*Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9 */

public class StrDist { 
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat")); // → 9
        System.out.println(strDist("catcowcat", "cow")); // → 3
        System.out.println(strDist("cccatcowcatxx", "cat")); // → 9
    }

    public static int strDist(String str, String sub) {
        // Base case: if the string is shorter than the substring, return 0
        if (str.length() < sub.length()) {
            return 0;
        }

        // Check if the string starts with the substring
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length(); // Return the length of the current substring
        }

        // If it doesn't start with the substring, remove the first character and recurse
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        // If it doesn't end with the substring, remove the last character and recurse
        return strDist(str.substring(0, str.length() - 1), sub);
    }
}