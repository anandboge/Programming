/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a 
period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true */

public class XyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); // Output: true
        System.out.println(xyzThere("abc.xyz")); // Output: false
        System.out.println(xyzThere("xyz.abc")); // Output: true
    }
    
    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '.') {
                i++;
            } else if (str.substring(i, i + 3).equals("xyz")) {
              return true;
            }
          }
            return false; // If "xyz" doesn't appear
    }}