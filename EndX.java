/*Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx" */

public class EndX {

    public static void main(String[] args) {
        System.out.println(endX("xxre")); // Output: rexx
        System.out.println(endX("xxhixx")); // Output: hixxxx
        System.out.println(endX("xhixhix")); // Output: hixixxx
    }
    
    public static String endX(String str) {
        if (str.length() == 0) {
            return str;
        }
        
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        } else {
            return str.charAt(0) + endX(str.substring(1));
        }
    }
}