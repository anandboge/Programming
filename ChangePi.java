/*Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p" */

public class ChangePi {

    public static void main(String[] args) {
        System.out.println(changePi("xpix")); // Output: x3.14x
        System.out.println(changePi("pipi")); // Output: 3.143.14
        System.out.println(changePi("pip")); // Output: 3.14p
    }
    
    public static String changePi(String input) {
        if (input.length() < 2) {
            return input;
        } else if (input.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(input.substring(2));
        } else {
            return input.substring(0, 1) + changePi(input.substring(1));
        }
    }
}