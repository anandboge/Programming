/*Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 
For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x" */

public class SameEnds {

    public static void main(String[] args) {
        System.out.println(sameEnds("abXab")); // Output: ab
        System.out.println(sameEnds("abXYab")); // Output: ab
        System.out.println(sameEnds("xx")); // Output: x
        System.out.println(sameEnds("xxx")); // Output: x
    }
    
    public static String sameEnds(String string) {
    int middle = string.length() / 2;
    for (int i = middle; i >= 0; i--) {
      String left = string.substring(0, i);
      if (string.endsWith(left)) {
          return left;
      }
    }
    return "";
    }
}