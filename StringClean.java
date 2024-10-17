/*Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. 
So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo" */

public class StringClean{
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza")); // Output: yza
        System.out.println(stringClean("abbbcdd")); // Output: abcd
        System.out.println(stringClean("Hello")); // Output: Helo
    }
    
    public static String stringClean(String input) {
        if (input.length() <= 1) {
            return input;
        }
        
        char currentChar = input.charAt(0);
        char nextChar = input.charAt(1);
        
        if (currentChar == nextChar) {
            return stringClean(input.substring(1));
        } else {
            return currentChar + stringClean(input.substring(1));
        }
    }
}