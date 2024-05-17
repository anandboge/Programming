/*Given a string, return a string length 1 from its front, unless front is false, in which case return a 
string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */

public class TheEnd {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true)); // Output: "H"
        System.out.println(theEnd("Hello", false)); // Output: "o"
        System.out.println(theEnd("oh", true)); // Output: "o"
    }
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1, str.length());
        }
    }
}
