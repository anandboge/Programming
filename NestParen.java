/*Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.


nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false*/

public class NestParen{
     public static void main(String[] args) {
        System.out.println(nestParen("(())"));      // true
        System.out.println(nestParen("((()))"));    // true
        System.out.println(nestParen("(((x))"));    // false
    }

    public static boolean nestParen(String str) {
        // Base case: empty string is valid
        if (str.isEmpty()) {
            return true;
        }
        
        // If the string starts with '(' and ends with ')', recurse on the inner substring
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        
        // Otherwise, it's invalid
        return false;
    }
}