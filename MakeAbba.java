/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat" */

public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye")); // Output: "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice")); // Output: "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up")); // Output: "WhatUpUpWhat"
    }
    public static String makeAbba(String a, String b) {
        return a + b + b + a; 
      }
}
