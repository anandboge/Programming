/*Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1 */

public class Count11 {
    public static void main(String[] args) {
        System.out.println(count11("11abc11")); // Output: 2
        System.out.println(count11("abc11x11x11")); // Output: 3
        System.out.println(count11("111")); // Output: 1
    }
    
    public static int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }
    }
}