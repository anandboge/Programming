/*Given a string and a non-empty word string, return a version of the original String where all chars 
have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy" */

public class PlusOut {

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); // Output: ++xy++
        System.out.println(plusOut("12xy34", "1")); // Output: 1+++++
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // Output: ++xy++xy+++xy
    }
    
    public static String plusOut(String s, String word) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (word.indexOf(c) == -1) {
                result.append('+');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}