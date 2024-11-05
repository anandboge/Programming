/*Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"*/

public class ParenBit{
     public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123")); // Output: (abc)
        System.out.println(parenBit("x(hello)"));    // Output: (hello)
        System.out.println(parenBit("(xy)1"));       // Output: (xy)
    }

    public static String parenBit(String str) {
        // Base case: if the string is empty
        if (str.isEmpty()) {
            return "";
        }

        // If the first character is '(', find the closing parenthesis
        if (str.charAt(0) == '(') {
            int closeIndex = str.indexOf(')');
            if (closeIndex != -1) {
                // Return the substring from the first '(' to the first ')'
                return str.substring(0, closeIndex + 1);
            }
        }

        // If the first character is not '(', recursively call the function on the substring
        return parenBit(str.substring(1));
    }
}