/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → "" */

public class NoX {

    public static void main(String[] args) {
        System.out.println(noX("xaxb")); // Output: ab
        System.out.println(noX("abc")); // Output: abc
        System.out.println(noX("xx")); // Output: ""
    }
    
    public static String noX(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }
        
        // Recursive case: if the first character is 'x', remove it and concatenate the result of the rest of the string
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        } else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }
}