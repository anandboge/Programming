/*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. 
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the 
chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0 */

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3")); // Output: 6
        System.out.println(sumDigits("aa11b33")); // Output: 8
        System.out.println(sumDigits("Chocolate")); // Output: 0
    }
    
    public static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}