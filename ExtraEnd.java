/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi" */

public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello")); // Output: "lololo"
        System.out.println(extraEnd("ab")); // Output: "ababab"
        System.out.println(extraEnd("Hi")); // Output: "HiHiHi"
    }
    public static String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }
}
