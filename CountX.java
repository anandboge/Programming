/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0 */

public class CountX {
    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == 'x' && Character.isLowerCase(str.charAt(0))) {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(countX("xxhixx")); // Output: 4
        System.out.println(countX("xhixhix")); // Output: 3
        System.out.println(countX("hi")); // Output: 0
    }
}