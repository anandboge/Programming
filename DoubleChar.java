/*Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree" */

public class DoubleChar {
    public static String doubleChar(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The")); // TThhee
        System.out.println(doubleChar("AAbb")); // AAAAAbbbb
        System.out.println(doubleChar("Hi-There")); // HHii--TThheerree
    }
}