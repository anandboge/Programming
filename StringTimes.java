/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi" */

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.print("Enter the first number: ");
        int m = input.nextInt();
        System.out.println(stringTimes(string, m));
    }
    public static String stringTimes(String str, int n) {
        String str1 = "";
        for (int i=0; i<n; i++) {
          str1 = str1 + str;  
        }
        return str1;
      }
}
