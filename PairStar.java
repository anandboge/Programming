/*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are 
separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a" */

public class PairStar {

    public static void main(String[] args) {
        System.out.println(pairStar("hello")); //hel*lo
        System.out.println(pairStar("xxyy")); //x*xy*y
        System.out.println(pairStar("aaaa")); //a*a*a*a
    }
    
    public static String pairStar(String input) {
        if (input.length() <= 1) {
            return input;
        }
        
        if (input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + "*" + pairStar(input.substring(1));
        } else {
            return input.charAt(0) + pairStar(input.substring(1));
        }
    }
}